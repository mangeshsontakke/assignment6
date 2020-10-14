
import java.util.ArrayList;
import java.util.List;

	/*12.  Given integer array
		input :int[] arr={2,3,5,4,1,6,7,7,9};

	Remove the duplicate elements and print sum of even numbers in the array..
	print -1 if arr contains only odd numbers          */

	public class Program12 {
	public static void main(String[] args) {
		      int a[]={2,3,5,4,1,6,7,7,9};
		      int n=0,n1;
		      
		      List<Integer> l1=new ArrayList<Integer>();
		      for(int i=0;i<a.length;i++)
		            l1.add(a[i]);
		      
		      List<Integer> l2=new ArrayList<Integer>();
		      for(int i=0;i<a.length;i++)
		      for(int j=i+1;j<a.length;j++)
		            if(a[i]==a[j])
		                  l2.add(a[j]);
		      System.out.println(l2);//[7]
		      l1.removeAll(l2);
		      l1.addAll(l2);
		      System.out.println(l1);//[2, 3, 5, 4, 1, 6, 9, 7]
		      
		    for(int i=0;i<l1.size();i++)
		            if(l1.get(i)%2==0)//even number check
		                n=n+l1.get(i);//addition even number 
		      if(n==0)
		            n1=-1;
		      else
		            n1=n;
		    System.out.println(n1);//[12]
		}

		}