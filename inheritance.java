import java.util.*;

class Addition {

int n1,n2,n3;
	
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		n1=sc.nextInt();
		
		System.out.print("Enter second number : ");
		n2=sc.nextInt();
	}
	public void sum(){
		n3=n1+n2;
		
	}
	
	public void display1(){
		
		System.out.println("\n addition is : "+n3);
	}
  
}

class Substraction extends Addition {
	
	public void sbt(){
		n3=n1-n2;
		
	}
	
	public void display2(){
		
		System.out.print("\n Substraction is : "+n3);
		
		
	}
	
}
	
 
class Multiply extends Substraction{
	
	public void mlt(){
		
		n3=n1*n2;
		
		
	}
	
	public void display3(){
		
		System.out.println("\n multiplication is : "+n3);
	
    }	
}

class Division extends Multiply{
	
	
	
	public void dvd(){
		
		n3=n1/n2;
		
	}
	
	public void display4(){
		
			System.out.println("\n quotient is : "+n3);
	
    }
	
}	


class  inheritance{
	
	public static void main (String s[]){
		
		division d1=new division();
		
		d1.input();
		d1.sum();
		d1.display1();
		
		
		d1.sbt();
		d1.display2();
		
		
		d1.mlt();
		d1.display3();
		
		
		d1.dvd();
		d1.display4();
		
	}
}