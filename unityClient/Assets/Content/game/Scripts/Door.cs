using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Door : MonoBehaviour
{
    public float timeUntilClose = 1f;
    private float timer = 0f;
    private bool isOpen = false;
    Animator animator;

    public void Start()
    {
        animator = GetComponent<Animator>();
    }

    public void Open()
    {
        isOpen = true;
        timer = timeUntilClose;

        if (animator)
        {
            animator.SetBool("DoorTriggered", true);
        }
        else
        {
            GetComponent<Collider>().enabled = false;
            GetComponent<Renderer>().enabled = false;
        }
    }

    public void Close()
    {
        isOpen = false;

        if (animator)
        {
            animator.SetBool("DoorTriggered", false);
        }
        else
        {
            GetComponent<Collider>().enabled = true;
            GetComponent<Renderer>().enabled = true;
        }
    }

    void Update()
    {
        if (isOpen)
        {
            timer -= Time.deltaTime;

            if (timer < 0f)
            {
                Close();
            }
        }
    }
}
