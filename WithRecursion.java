package mycaptain;

public class WithRecursion {

	
		static int a = 0, b = 1, c ;
		   static void fibo(int count){
		      if (count > 0) {
		         c = a + b;
		         a = b;
		         b = c;
		         System.out.print("  " + c);
		         fibo(count - 1);
		      }
		   }
		   public static void main(String args[]) {
		      int count = 10;
		      System.out.print(a + "  " + b);
		      fibo(count - 2);
		   }

	}


