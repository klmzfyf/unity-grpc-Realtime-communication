using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Events;

[RequireComponent(typeof(LineRenderer))]
public class Laser : MonoBehaviour
{
    public Collider playerCollider;
    public UnityEvent OnHitPlayer;
    public float range = 50f;
    new public ParticleSystem particleSystem;

    LineRenderer lineRenderer;
    ParticleSystem.ShapeModule shape;
    Vector3 endPoint;

    void Awake()
    {
        lineRenderer = GetComponent<LineRenderer>();
        if (particleSystem != null)
        {
            shape = particleSystem.shape;
        }
    }

    void Update()
    {
        RaycastHit hit;
        endPoint = transform.forward * range;
        if (Physics.Raycast(transform.position, transform.forward, out hit, range))
        {
            endPoint = transform.InverseTransformPoint(hit.point);
            if (hit.collider == playerCollider)
            {
                OnHitPlayer.Invoke();
            }
        }
        if (particleSystem != null)
        {
            shape.radius = Mathf.Lerp(shape.radius, endPoint.magnitude / 2, Time.deltaTime);
            particleSystem.transform.localPosition = Vector3.Lerp(particleSystem.transform.localPosition, endPoint * 0.5f, Time.deltaTime);
        }
        lineRenderer.SetPosition(1, endPoint);
    }
}
