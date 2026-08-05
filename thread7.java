//demonstrate thread priorities
class one implements Runnable
{
        int click;
        Thread t;
        private volatile boolean running=true;
        public one(int p)
        {
        t=new Thread(this);
        t.setPriority(p);
        }
        public void run()
        {
        while(running)
        {
        click++;
        }
        }
        public void stop()
        {
        running=false;
        }
        public void start()
        {
        t.start();
        }
        }

class thread7 {
        public static void main(String args[])
        {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                one hi=new one(Thread.NORM_PRIORITY-2);
                one lo=new one(Thread.NORM_PRIORITY+2);
                lo.start();
                hi.start();
                try {
                        Thread.sleep(5000);
                    }catch(InterruptedException e){
                    System.out.println("Main thread interrupted");
                    }
/*                    lo.stop();
                    hi.stop();
                    try {
                    hi.t.join();
                    lo.t.join();
                    }catch(InterruptedException e){
                    System.out.println("Interrupted Exception Caught");
                    }*/
                    System.out.println("Low prority thread:   "+lo.click);
                    System.out.println("High prority thread:  "+hi.click);
                    }
                    }                                                        
