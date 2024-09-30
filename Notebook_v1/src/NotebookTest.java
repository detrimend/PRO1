public class NotebookTest
{
    public static void main(String[] args)
    {
      Notebook myNotes = new Notebook(10);

      myNotes.addNote("Check Facebook");
      myNotes.addNote("Call my mother on the phone");
      myNotes.addHighPriorityNote("Make SDJ exercises");

      System.out.println("Most important: " + myNotes.getMostImportantNote());

      myNotes.removeNote(2);

      System.out.println("Most important: " + myNotes.getMostImportantNote());
    }
}
