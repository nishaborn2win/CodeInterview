package sudoMath;

import java.util.Scanner;

public class Math_01_LCMGCD {
	public static int gcd(int a,int b) {
		if(a==0 || b==0)
			return 0;
		else if(a==b)
			return a;
		else if(a>b)
			return gcd((a-b),b);
		return gcd(a,(b-a));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of testcase");
		int t = sc.nextInt();
		while(t--!=0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		    System.out.println("GCD :"+gcd(a,b));
		    System.out.println("LCM :"+((a*b)/gcd(a,b)));
		}
	sc.close();	
	}

}
