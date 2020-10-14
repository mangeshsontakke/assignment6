import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	/*13. input array={red,green,blue,ivory}
	sort the given array
	reverse the given array
	if user input is 1 it should give oth element of an reversed array.              */
	public class Program13 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] array={"red","green","blue","ivory"};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a integer:   ");
			int n=sc.nextInt();
			
			String s1=new String();
			ArrayList<String> list=new ArrayList<String>();	
			for(int i=0;i<array.length;i++)
				list.add(array[i]);
			System.out.println(list);
		
			Collections.sort(list, Collections.reverseOrder());
			System.out.println(list);
	         
			 for(int i=0;i<list.size();i++)
				  if(i==(n-1))
				   s1=list.get(i);
				 System.out.println(s1);
		}

	}
