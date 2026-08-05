//demonstrates sybchronisation
class callme
{
        synchronized void call(String msg)
        {
                System.out.print("["+msg);
                try {
                        Thread.sleep(1000);
                    }catch(InterruptedException e) {
                    System.out.println("Interrupted");
                    }
                    System.out.println("]");
        }
}
class Caller implements Runnable
{
        String msg;
        callme target;
        Thread t;
        public Caller(callme targ,String s)
        {
         target=targ;
         msg=s;
         t=new Thread(this);
         t.start();
         }
         public void run()
         {
         target.call(msg);
         }
}
class thread9
{
        public static void main(String args[])
        {
                callme target=new callme();
                Caller ob1=new Caller(target,"Hello");
                Caller ob2=new Caller(target,"Synchronised");
                Caller ob3=new Caller(target,"World");
                try {
                ob1.t.join();
                ob2.t.join();
                ob3.t.join();
                }catch(InterruptedException e){
                System.out.println("Interrupted");
                }
        }
}
