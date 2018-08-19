package sudoMath;

import java.util.Scanner;

public class Math_02_PowerOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of testcase");
		int t = sc.nextInt();
		while(t--!=0) {
			long a = sc.nextLong();
			if(a==0) {
				System.out.println("No");
			}
			else
			{
				int r = (int)(Math.log(a)/Math.log(2));
				if(a==1 || Math.pow(2, r)==a)
				  System.out.println("Yes");
				else
				  System.out.println("No");
			}
		}
	sc.close();	
	}

}
