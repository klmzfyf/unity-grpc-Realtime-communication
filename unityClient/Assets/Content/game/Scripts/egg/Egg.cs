using com.skw.recive;
using UnityEngine;
using UnityStandardAssets.Characters.ThirdPerson;

public class Egg : MonoBehaviour
{


 
    public static GameObject create(GameObject player,int id, string name , Vector3 position,Quaternion rotation , bool isPlayer)
    {
        GameObject playerobject = Instantiate(player, position, rotation);
        PlayerInfo playerInfo = playerobject.GetComponent<PlayerInfo>();
        playerInfo.Id = id;
        playerInfo.name = name;
        if (isPlayer)
        {
           
        }
        else
        {
            playerobject.GetComponent<ThirdPersonUserControl>().enabled=false;
            playerobject.GetComponent<SendRadio>().enabled = false;
            playerobject.GetComponent<RecviM>().enabled = false;
            playerobject.GetComponent<PlayerInfo>().enabled = false;
        }
        return playerobject;

       
    }
}
