using Assets.Content.game.Scripts.playerOperate;
using Com.Skw.PlayerOperate;
using System;
using UnityEngine;

namespace UnityStandardAssets.Characters.ThirdPerson
{
    [RequireComponent(typeof(ThirdPersonCharacter))]
    public class ThirdPersonUserControl : MonoBehaviour
    {
         // A reference to the ThirdPersonCharacter on the object
        private Transform m_Cam;                  // A reference to the main camera in the scenes transform
        private Vector3 m_CamForward;             // The current forward direction of the camera
        private Vector3 m_Move;
        private bool m_Jump;                      // the world-relative desired move direction, calculated from the camForward and user input.

        private PlayerOperator playerOperator;
        public GameObject playerPrefeb;

        private int difference = 2000;
        private void Start()
        {
            // get the transform of the main camera
            if (Camera.main != null)
            {
                m_Cam = Camera.main.transform;
            }
            else
            {
                Debug.LogWarning(
                    "Warning: no main camera found. Third person character needs a Camera tagged \"MainCamera\", for camera-relative controls.", gameObject);
                // we use self-relative controls in this case, which probably isn't what the user wants, but hey, we warned them!
            }

            // get the third person character ( this should never be null due to require component )
           
            //������ò��ԡ�����ɾ����
            EnterKtv();
        }
        public void EnterKtv()
        {
            playerOperator = new PlayerOperator();
        }
        

        // Fixed update is called in sync with physics
        private async void FixedUpdate()
        {
            // read inputs
            float h = Input.GetAxis("Horizontal");
            float v = Input.GetAxis("Vertical");
            bool crouch = Input.GetKey(KeyCode.C);

            // calculate move direction to pass to character
            if (m_Cam != null)
            {
                // calculate camera relative direction to move:
                m_CamForward = Vector3.Scale(m_Cam.forward, new Vector3(1, 0, 1)).normalized;
                m_Move = v * m_CamForward + h * m_Cam.right;
            }
            else
            {
                // we use world-relative directions in the case of no main camera
                m_Move = v * Vector3.forward + h * Vector3.right;
            }
#if !MOBILE_INPUT
            // walk speed multiplier
            if (Input.GetKey(KeyCode.LeftShift)) m_Move *= 0.5f;
#endif

            // �������Ĳ������͵��������ϡ����������غ����ƶ�������Ӧ���и��̶�ʱ������ͳһ��
           
            sendToServer(m_Move, crouch);
            //�ŵ�һ�������߼��С������������״̬��Ŀǰ��û������Ҽ������
            AllPlayerOperation allPlayerOperation = await playerOperator.receiveOperate();
           // Debug.Log(Time.deltaTime);
            controllerAllplayers(allPlayerOperation);

            m_Jump = false;
        }
        private void sendToServer(Vector3 move, bool crouch)
        {
            OnePlayerOperation onePlayerOperation = new OnePlayerOperation();
            onePlayerOperation.Crouch = crouch;
            onePlayerOperation.Id = GetComponent<PlayerInfo>().Id;
            onePlayerOperation.Position = new Position();
            onePlayerOperation.Position.X = (int)(GetComponent<Transform>().position.x * 1000);
            onePlayerOperation.Position.Y = (int)(GetComponent<Transform>().position.y * 1000);
            onePlayerOperation.Position.Z = (int)(GetComponent<Transform>().position.z * 1000);
            onePlayerOperation.Parameter  = new MoveParameter();
            onePlayerOperation.Parameter.X = (int)(move.x * 10);
            onePlayerOperation.Parameter.Y = (int)(move.y * 10);
            onePlayerOperation.Parameter.Z = (int)(move.z * 10);
           
            playerOperator.sendOperate(onePlayerOperation);
        }
        private void controllerAllplayers(AllPlayerOperation allPlayerOperation)
        {
            for (int i = 0; i < allPlayerOperation.PlayerOperation.Count; i++)
            {
                //�ҵ���ǰҳ���ϵ�����player
                GameObject[] players = GameObject.FindGameObjectsWithTag("Player");
                bool isfind = false;
                foreach(var player in players)
                {
                    if(player.GetComponent<PlayerInfo>().Id == allPlayerOperation.PlayerOperation[i].Id)
                    {
                        movePlayer(player,allPlayerOperation.PlayerOperation[i]);
                        isfind = true;
                        //�ý�ɫ���ƶ�
                        break;
                    }

                }
                if(isfind != true) {
                    //û���ҵ���Ӧ��ɫ������һ����ɫ��
                    GameObject playerCreated = createBot(allPlayerOperation.PlayerOperation[i]);
                    movePlayer(playerCreated, allPlayerOperation.PlayerOperation[i]);
                }  
            }
        }
        private GameObject createBot(OnePlayerOperation playerOperation)
        {
            Vector3 position = new Vector3();
            position.x = (float)playerOperation.Position.X / 1000;
            position.y = (float)playerOperation.Position.Y / 1000;
            position.z = (float)playerOperation.Position.Z / 1000;
            GameObject player = Egg.create(playerPrefeb, playerOperation.Id,
                null, position
                , new Quaternion(0, 0, 0, 0), false);
            return player;
        }
        private void movePlayer(GameObject player,OnePlayerOperation playerOperation)
        {

            Debug.Log("�ͻ���"+player.transform.position);

            Debug.Log("������"+playerOperation.Position);
            //�жϽ�ɫ��λ�úͷ��͹�����λ����û�в����������ǿ�Ƹ��¡�
            if (Mathf.Abs((int)player.transform.position.x*1000 - playerOperation.Position.X )> difference ||
                // Mathf.Abs((int)player.transform.position.y * 1000 - playerOperation.Position.Y )> difference ||
                Mathf.Abs((int)player.transform.position.z * 1000 - playerOperation.Position.Z) >difference)
            {
                player.transform.position = new Vector3((float)playerOperation.Position.X / 1000f, (float)playerOperation.Position.Y / 1000f,
                    (float)playerOperation.Position.Z / 1000f);
                Debug.Log("������");
            }

            //ʹ�ý�ɫ�ƶ�
            Vector3 server_move = new Vector3((float)playerOperation.Parameter.X / 10,
                                    (float)playerOperation.Parameter.Y / 10,
                                    (float)playerOperation.Parameter.Z / 10);

            ThirdPersonCharacter m_Character = player.GetComponent<ThirdPersonCharacter>();
            m_Character.Move(server_move, playerOperation.Crouch, m_Jump);
        }
    }
    
}
