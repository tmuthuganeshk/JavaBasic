package TJava;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=0,c,d;
		d=a;
		while(a>0) {
			c=a%10;
			a=a/10;
			b=b+c*c*c;
			
		}if(b==d) {
			System.out.println("it is armstrong no");
		}else {
			System.out.println("it is not");
		}
		

	}

}
