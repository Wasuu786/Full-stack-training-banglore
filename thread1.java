//multiple threads

class newthread implements Runnable
{
  Thread t;
  String name;
  newthread(String name)
  {
    this.name = name;
    t = new Thread(this,name);
    System.out.println(t);
    t.start();
  }
  public void run()
  {
    try
    {
      for(int i = 1; i <= 10; i++)
      {
        System.out.println(name + " " + i);
        Thread.sleep(500);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println(name + " interrupted");
    }
    System.out.println(name + " exiting");

  }
}
class thread5
{
  public static void main(String args[]) throws InterruptedException
  {
    new newthread("One");
    new newthread("Two");
    new newthread("Three");

    for(int i = 1; i <= 10; i++)
      {
        System.out.println("Main thread " + i);
        Thread.sleep(10000);
      }

    System.out.println("Main thread exiting");
  }
}
