//Implementing thread using Runnable
class mythread implements Runnable
{
  Thread t;
  mythread()
  {
    t = new Thread(this,"Child thread");
    System.out.println(t);
    t.start();
  }
  public void run()
  {
    try
    {
      for(int i = 1; i <= 10; i++)
      {
        System.out.println("Child thread " + i);
        Thread.sleep(500);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Child thread interrupted");
    }
  }
}
class thread3
{
  public static void main(String args[])
  {
    new mythread();
    try
    {
      for(int i = 1; i <= 10; i++)
      {
        System.out.println("Main thread " + i);
        Thread.sleep(1000);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Main thread interrupted");
    }

  }
}
