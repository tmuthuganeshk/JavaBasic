package TJava;

import java.util.Scanner;

public class FactorialSerices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}System.out.println(fact);
	}

}
