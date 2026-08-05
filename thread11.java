class thread2
{
  public static void main(String args[])
  {
    try
    {
      for(int i = 1; i <= 10; i++)
      {
        System.out.println(i);
        Thread.sleep(10000);    //milliseconds
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Thread interrupted");
    }
  }
}
