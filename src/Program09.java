import java.util.ArrayList;
import java.util.List;

	/*9. An array of integers is given.The given element is removed new array is returned.
	input1:{10,10,20,30,76}
	output: {20,20,76}(10 is asked to remove)          */

	public class Program09 {
	public static void main(String[] args) {
		
			int[] input={10,10,20,30,76};
			int k=10;
		   
			for(int i=0;i<input.length;i++)
				if(input[i]>k)
					System.out.println(input[i]);
	   }		
	}
