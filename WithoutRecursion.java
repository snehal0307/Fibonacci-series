package mycaptain;

public class WithoutRecursion {

	public static void main(String[] args) {
		int a=0,b=1;
		for(int i=0;i<10;i++)
		{
			System.out.print(a+"  ");
			int c;
			c=a+b;
			a=b;
			b=c;
		}
		
	}


	}
