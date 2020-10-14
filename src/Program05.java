
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
						
/*5.Retrieve the palindrome - true number set from given number limit and return the sum
input1:90 input2:120
logic:99+101+111
output:311
 */

public class Program05 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("sum of palindrome nos.within given range is: "+sumOfPalindromeNos(n1,n2));
	}
	
	public static int sumOfPalindromeNos(int n1,int n2)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int i=n1;i<=n2;i++)//n1 = 90 , n2 = 120 
		{
			int r=0,n3=i;//n3=90
			while(n3 != 0)//unkwon condition as per users input
			{
				r = (r*10) + (n3%10);// 99 = reminder 9 + reminder 9 = 90 + 9reminder
				n3=n3/10;//skip 9
			}
			if(r == i)
				list.add(i);//Add palindrome if num and r are equals  = 99+101+111 
			}System.out.println(list);//print list of palindrome numbers finding in range
			int sum=0;// for addition of palindrome
			for(int i=0; i<list.size(); i++)
				sum += list.get(i);// Addition 
			return sum;// return Sum of Palindrome Numbers
			}
}
