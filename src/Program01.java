
public class Program01 {

	/*1.Given two integer arrays. merge the common elements into a new array. find the sum of the elements
	input1:{1,2,3,4}
	input2:{3,4,5,6}
	logic:{3,4}
	output:7                 */
	
	public static void main(String[] args) {
			
			int input1[]={1,2,3,4};
			int input2[]={3,4,5,6};
			  int c=0;
	  for(int i=0;i<input1.length;i++){
			for(int j=0;j<input2.length;j++){
				if(input1[i]==input2[j])
				{
					System.out.print(input1[i]+"  ");//3,4
					c=c+input1[i];
				}
			}
		 }
	  System.out.println();
	  System.out.println("Addition of a common Array:    "+c);
		}

	}
