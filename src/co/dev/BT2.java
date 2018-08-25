package co.dev;

import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
		int n,i;
		int s=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can tinh giai thua");
		n=sc.nextInt();
		for(i = 1; i <= n; i++)
	     {
	    	 s = s * i;	      
	     }
	 	 System.out.println("giai thua so can tim la:" + s);

	}
}
