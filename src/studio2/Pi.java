package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int incircle=0;
		for (int i=1; i<=10000; i++) {
			double x=Math.random()-0.5;
			double y=Math.random()-0.5;
			if ((x*x+y*y)<0.25)
			{
				incircle++;
			}
		}
		
		System.out.println((incircle*1.0/10000)*4);
			
		

	}

}
