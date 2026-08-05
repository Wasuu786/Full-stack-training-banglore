class NumberThread extends Thread {
	
    public void run() {
		
        for (int i = 1; i <= 50; i++) {
			
            System.out.println("Number: " + i);
        }
    }

class AlphabetThread extends Thread {
	
    public void run() {
		
        for (char ch = 'A'; ch <= 'Z'; ch++) {
			
            System.out.println("Alphabet: " + ch);
        }
    }
}

class TwoThreadsDemo {
	
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        AlphabetThread t2 = new AlphabetThread();

        
        t1.start();
        t2.start();
    }
}