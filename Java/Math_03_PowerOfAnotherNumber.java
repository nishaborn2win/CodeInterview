// power of another number
// Time complexity O(Log(n))
// https://www.geeksforgeeks.org/check-if-a-number-is-power-of-another-number/

package sudoMath;

import java.util.Scanner;

public class Math_03_PowerOfAnotherNumber {
	
	//Method: 1 Time Complexity=O(log(n))
	
	public static boolean powAnotherNum(int a, int b)
	{
		if(a==1)
			return (b==1);
		if(b==0)
			return false;
		int p = 1;
		
		while(p<b) {
			p = p * a;
		}
		if(p==b)
			return true;
		else
			return false;
	}
	
	//Method: 2 Time Complexity=O(log logn)
	public static boolean powAnotherNum1(int a, int b)
	{
		int x= (int)(Math.log(b))/(int)(Math.log(a));
		
		double y = (Math.log(b))/(Math.log(a));
		
		if(y==x)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of testcases");
		int t = sc.nextInt();
		while(t--!=0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
		System.out.println(powAnotherNum(a,b));
		System.out.println(powAnotherNum(a,b));
		}
		sc.close();
	}

}
