using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayAudioOnCollision : MonoBehaviour
{
    public AudioClip clip;
    public AudioSource audioSource;
    public Collider triggeredBy;

    void OnCollisionEnter(Collision collision)
    {
        if (Time.timeSinceLevelLoad > 0.1)
        {
            if(triggeredBy == null || collision.collider == triggeredBy)
            {
                audioSource.PlayOneShot(clip);
            }
        }
    }
}
