// Angle between Hour hand and Minute hand
package sudoMath;

import java.util.Scanner;

public class Math_05_HrHandMinHand {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t--!=0) {
			double h_angle,m_angle,ang,hmangle;
			double h = sc.nextDouble();
			double m = sc.nextDouble();
//************Calculate angle for hour hand***********************
//************Totally 60 min and in every 1 hour hr hand angle moved per one min= 30/60 =>0.5****************		
			if((int)h==12)
				h_angle = m*0.5;
//************Totally 12 hrs and angle moved for one hr	= 360/12 =>30**************** 			
			if((int)m==60)
				h_angle = h*30;
			else
				h_angle = (h*30)+(m*0.5);
//************Calculate angle for minute hand**********************			
//************Totally 60 min and angle moved for one min	= 360/60 =>6****************			
			m_angle = m*6;
			
			ang = Math.abs(h_angle-m_angle);
			
			hmangle = Math.min(360-ang,ang);
			
			System.out.println(hmangle);
				
		}
		
        sc.close();
	}

}
