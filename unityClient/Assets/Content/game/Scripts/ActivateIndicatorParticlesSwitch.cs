using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Unity.InteractiveTutorials;

public class ActivateIndicatorParticlesSwitch : MonoBehaviour
{
    public GameObject m_ParticleSystemGameObject;

    void OnTriggerEnter(Collider collider)
    {
        if (collider.GetComponent<IPlayerAvatar>() != null && !m_ParticleSystemGameObject.activeInHierarchy)
        {
            m_ParticleSystemGameObject.SetActive(true);
        }
    }
}
