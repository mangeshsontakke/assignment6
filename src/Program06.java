import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*6. HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) = 90
 */
public class Program06 {
	
	public static void main(String[] args) 
	{
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(12, 90);
		m1.put(35, 90);
		m1.put(33, 90);
		m1.put(56, 88);
	
		int num = 0,count = 0;
		
		Iterator<Integer> i=m1.keySet().iterator();
		
		while(i.hasNext())
		{
			Integer b = i.next();
			if(b%2!=0)// find odd key here 33 / 35 = 90
			{
				count++;
				num+=m1.get(b);// get value of key 33 = 90+90 = 180
			} 
		}System.out.println(num/count);
	}
}