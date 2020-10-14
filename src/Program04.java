import java.util.ArrayList;
import java.util.Collections;

/*4.Two inputs of a string array and a string is received.The array should be sorted in descending order. 
   	The index of second input in a array should be retrieved.
	input1:{"ga","yb","awe"}
	input2:awe
	output:2
 */
public class Program04 {

	public static void main(String[] args) 
	{
		String[] s1={"ga","yb","awe"};
		String s2="awe";// search input into s1 
	
		ArrayList<String> arrlist=new ArrayList<String>();
		for(int i=0;i<s1.length;i++)
			arrlist.add(s1[i]);// adding all elements into array list
		 
		Collections.sort(arrlist,Collections.reverseOrder());// sort and reverse order done by collection
		//System.out.println(arrlist);//[yb , ga , awe]
		int n=arrlist.indexOf(s2);
		System.out.println(n);
		
	}
}