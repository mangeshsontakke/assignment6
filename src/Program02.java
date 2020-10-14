import java.util.ArrayList;
	import java.util.Scanner;
	/*2. Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.
	Input:9
	Output:1+3-5+7-9=-3                                                                                                */
	public class Program02 {
	 public static void main(String[] args) {
			  Scanner s=new Scanner(System.in);
			  System.out.println("Enter a Integer no.:");
			  int n=s.nextInt();
			  ArrayList<Integer> k=new ArrayList<Integer>();
			  for(int i=1;i<=n;i++)
			   if(i%2!=0)//odd
			    k.add(i);//13579
			  int n1=1;
			  for(int i=1;i<k.size();i++)
			   if(i%2!=0)
			    n1=n1+k.get(i);
			   else
			    n1=n1-k.get(i);
			  System.out.println(n1);
			 
			 }

	}
