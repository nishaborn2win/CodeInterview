package sudoMath;

import java.util.Scanner;
public class Math_04_NDoorProblem {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
        	System.out.println("Enter no.of testcases");
        	long a = sc.nextLong();
        	
        	int n =(int)(Math.sqrt(a));
        	System.out.println(n);	
        }
        sc.close();
	}

}
