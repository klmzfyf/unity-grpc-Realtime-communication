using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Events;
using Unity.InteractiveTutorials;

[RequireComponent(typeof(ParticleSystem))]
public class Fireworks : MonoBehaviour
{
    public float launchPeriod = 1f;

    new ParticleSystem particleSystem;

    void Start()
    {
        particleSystem = GetComponent<ParticleSystem>();
        var emission = particleSystem.emission;
        emission.enabled = false;
        var main = particleSystem.main;
        StartCoroutine(LaunchTimer());
        GetComponent<AudioSource>().Play();
    }

    IEnumerator LaunchTimer()
    {
        var delay = new WaitForSeconds(launchPeriod);
        while (true)
        {
            particleSystem.Emit(1);
            yield return delay;
        }
    }
}
