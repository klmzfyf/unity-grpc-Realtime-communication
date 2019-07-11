using System.Collections;
using System.Collections.Generic;
using UnityEngine;

//该类用来保存玩家信息。
public class PlayerInfo : MonoBehaviour
{
    public string Name { get; set; }
    public int Id { get; set; } 
    public List<int> NearIds = new List<int>();
   

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    public void checkNearPlayers()
    {
        //这里检测用户附近有没有可以通话的对象。
        Collider[] nearPlayerColliders =  Physics.OverlapSphere(transform.position,10f);
        NearIds.Clear();
        foreach (Collider nearPlayerCollider in nearPlayerColliders)
        {
            if(nearPlayerCollider.tag == "Player" && nearPlayerCollider.GetComponent<PlayerInfo>()!=this)
            {
                NearIds.Add(nearPlayerCollider.GetComponent<PlayerInfo>().Id);
            }
          
        }
    }
}
