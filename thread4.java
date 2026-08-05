class newthread extends Thread
{
  newthread()
  {
    super("Child thread");
    System.out.println(this);
    start();
  }
  public void run()
  {
    try
    {
      for(int i = 10; i > 0; i--)
      {
        System.out.println("Child thread " + i);
        Thread.sleep(1000);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Child thread interrupted");
    }
    System.out.println("Child thread exiting");
  }
}
class thread4
{
  public static void main(String args[])
  {
    new newthread();
    try
    {
      for(int i = 1; i <=10; i++)
      {
        System.out.println("Main thread " + i);
        Thread.sleep(2000);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread exiting");
  }
}
