import java.util.*;

class EvenThread implements Runnable {

    public void run() {
	
        System.out.println("Even Numbers:");
		
        for (int i = 2; i <= 100; i += 2) {
		
            System.out.println(i);
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}


public class runnableDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Thread t1 = new Thread(new EvenThread());
        Thread t2 = new Thread(new OddThread());
       

        t1.start();
        t2.start();
       
    }
}