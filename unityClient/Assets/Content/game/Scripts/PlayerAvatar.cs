using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Unity.InteractiveTutorials;
using UnityStandardAssets.Characters.ThirdPerson;
using UnityEngine.Events;

[RequireComponent(typeof(Animator))]
public class PlayerAvatar : MonoBehaviour, IPlayerAvatar
{
    public UnityEvent OnDeath;
    public UnityEvent OnRespawn;
    public float respawnDelay = 5;

    GameController gameController;
    Animator animator;
    WaitForSeconds delay;
    new CapsuleCollider collider;

    void Awake()
    {
        animator = GetComponent<Animator>();
        collider = GetComponent<CapsuleCollider>();
        delay = new WaitForSeconds(respawnDelay);
        gameController = FindObjectOfType<GameController>();
    }

    public void Die()
    {
        StartCoroutine(DieThenRespawn());
    }

    IEnumerator DieThenRespawn()
    {
        animator.SetBool("DeathTrigger", true);
        var controller = GetComponent<ThirdPersonUserControl>();
        if (controller != null)
            controller.enabled = false;
        collider.height = 0.2f;
        collider.center = new Vector3(0, 0.3f, 0);
        OnDeath.Invoke();
        yield return delay;
        OnRespawn.Invoke();
        animator.SetBool("DeathTrigger", false);
        animator.Rebind();
        if (controller != null)
            controller.enabled = true;
        collider.height = 1.6f;
        collider.center = new Vector3(0, 0.8f, 0);

        gameController.RestartLevel();
    }
}
