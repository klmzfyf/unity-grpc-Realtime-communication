using Unity.InteractiveTutorials;
using UnityEditor;

static class TutorialWindowMenuItem
{
    [MenuItem("Tutorials/Open Tutorials Window")]
    static void OpenTutorialsWindow()
    {
        EditorWindow.GetWindow<TutorialWindow>();
    }
}
