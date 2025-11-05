package TJava;

import java.util.Scanner;

public class FibnociSerices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,c=1,d;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=0;i<=a;i++) {
			System.out.print(b+" ");
			d=c+b;
			b=c;
			
			c=d;
		}
		
	}

}
