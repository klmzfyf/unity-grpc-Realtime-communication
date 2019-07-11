using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;
using Unity.InteractiveTutorials;

public class Enemy : MonoBehaviour
{
    public Transform[] patrolPoints;
    public AudioClip[] audioClips;

    int patrolPointIndex;
    float proximityBeforeChangeDestination = 0.5f;
    NavMeshAgent navMeshAgent;
    Animator animator;

    void Start()
    {
        navMeshAgent = GetComponent<NavMeshAgent>();
        animator = GetComponent<Animator>();

        navMeshAgent.updatePosition = true;
        navMeshAgent.updateRotation = true;
        StartCoroutine(PlayAudio());
        SetNextDestination();
    }

    IEnumerator PlayAudio()
    {
        var delay = new WaitForSeconds(0.25f);
        var audio = GetComponent<AudioSource>();
        while (true)
        {
            yield return null;
            var rndDelay = Random.Range(4, 12);
            for (var i = 0; i < rndDelay; i++)
                yield return delay;
            audio.PlayOneShot(audioClips[Random.Range(0, audioClips.Length)]);
        }
    }

    void Update()
    {
        animator.SetFloat("Forward", navMeshAgent.desiredVelocity.magnitude, 0.1f, Time.deltaTime);

        if (!navMeshAgent.pathPending && navMeshAgent.remainingDistance < proximityBeforeChangeDestination)
        {
            SetNextDestination();
        }
    }

    void SetNextDestination()
    {
        navMeshAgent.SetDestination(patrolPoints[patrolPointIndex].position);
        patrolPointIndex = (patrolPointIndex + 1) % patrolPoints.Length;
    }

    void OnCollisionEnter(Collision c)
    {
        var other = c.gameObject;
        if (other.CompareTag("Player"))
        {
            other.SendMessage("Die");
        }
    }
}
