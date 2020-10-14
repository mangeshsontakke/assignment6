import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*24)input1 is a map<Integer,Float>
    {1:2.3,2:5.6,3:7.7,4:8.4}
    get the even number from keys and find the avg of values of these keys.
    answer should be rounded to two numbers after decimal
    eg:- the output number 15.2499999 should be 15.25
 */
public class Program24 {
	
	 public static void main(String[] args) {
		 Map<Integer,Float> m1=new HashMap<Integer, Float>();
		 m1.put(1, (float) 12.93);// due to fraction values type cast is used here
		 m1.put(2, (float) 15.67777);
		 m1.put(3, (float) 17.27);
		 m1.put(4, (float) 14.88);

		 int num=0,count=0;
		 float add=0;
		 Iterator<Integer> iterate = m1.keySet().iterator();
		 while(iterate.hasNext())
		 {
			 num = (Integer) iterate.next(); 
			 if(num%2==0)// for finding even key
			 {
				 add+=m1.get(num);// get values of even keys and add them
				 count++;// for avg
			 }
		 }
	  float ans = Math.round((add/count)*100)/100f;//answer should be rounded to two numbers after decimal
	  System.out.println(ans);
	 }	    
}