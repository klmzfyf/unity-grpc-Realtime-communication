using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Unity.InteractiveTutorials;

public class DeactivateGameObjectSwitch : MonoBehaviour
{
    public GameObject gameObjectToDeactivate;
    public float delayInSeconds;

    void OnTriggerEnter(Collider collider)
    {
        if (collider.GetComponent<IPlayerAvatar>() != null && gameObjectToDeactivate.activeInHierarchy)
        {
            StopAllCoroutines();
            StartCoroutine(RemovePlatform());
        }
    }

    private IEnumerator RemovePlatform()
    {
        yield return new WaitForSeconds(delayInSeconds);

        gameObjectToDeactivate.SetActive(false);
    }
}
