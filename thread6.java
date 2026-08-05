//isAlive and join
class mythread implements Runnable
{
  Thread t;
  String name;
  mythread(String name)
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
      for(int i = 1; i <= 3; i++)
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
class thread6
{
  public static void main(String args[ ]) throws InterruptedException
  {
    
    mythread t1 = new mythread("First");
    mythread t2 = new mythread("Second");
    mythread t3 = new mythread("Third");

    System.out.println("Thread first is alive " + t1.t.isAlive());
    System.out.println("Thread second is alive " + t2.t.isAlive());
    System.out.println("Thread third is alive " + t3.t.isAlive());

    t1.t.join();
    System.out.println("Thread first is alive " + t1.t.isAlive());
    System.out.println("Thread second is alive " + t2.t.isAlive());
    t2.t.join();
    t3.t.join();
     
    System.out.println("Thread third is alive " + t3.t.isAlive());

    System.out.println("Main thread exiting");
  }
}
