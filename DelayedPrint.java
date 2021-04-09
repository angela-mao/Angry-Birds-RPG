public class DelayedPrint
{
  public static void main (String args[])
  {
    new DelayedPrint ();
  }
  
  
  public DelayedPrint ()
  {
    printSlow ("Hello! \n");
    printSlow ("How are you?");
    printSlow ("This is how you print with a delay in Java.");
    System.out.println ("Feel free to use this code in your Project 1.");
    printSlow ("Happy Coding!! \n");
    printSlow ("G O O D B Y E =)");
  }
  
  
  public void printSlow (String s)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (100);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  }
} //class!
