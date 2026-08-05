//Threads 

class thread1 
{
  public static void main(String args[])
  {
    Thread t = Thread.currentThread();
    System.out.println("The current thread is " + t);
    t.setName("Main thread");
    System.out.println(t);
  }
}
