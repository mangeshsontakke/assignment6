
import java.util.Scanner;

	/*11. Retrieve the non-prime numbers within the range of a given input. Add-up the non-prime numbers and return the result.    */
public class Program11 {

		public static void main(String[] args) {
		
			int a=7,b=29,sum=0,flag;
			 for (int i = a; i <= b; i++) { 
				     flag = 1; 
		           for (int j = 2; j <= i / 2; j++) { 
		                if (i % j == 0) { 
		                    flag = 0; 
		                    break; 
		                } 
		            } 
			 
		             if (flag == 0) 
		               // System.out.println(i);//10,12,14,15,16,18,20
		           sum=sum+i;
		         }
			 System.out.println("Addition of Non-Prime Numbers:    "+sum);
			
		}

	}
