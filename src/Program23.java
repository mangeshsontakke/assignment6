import java.util.HashMap;
import java.util.Iterator;

	/*23) In a hashmap if key is odd then find average of value as integer
	    ex: h1={1:4,2:6,4:7,5:9}
	        output=(4+9)/2                     */

	public class Program23 {

		public static void main(String[] args) {
		
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			map.put(1, 4);
			map.put(2, 6);
			map.put(4, 7);
			map.put(5, 9);
			int sum=0;
			Iterator<Integer> i=map.keySet().iterator();
			   while(i.hasNext()){
				      int n=i.next();
					   //System.out.println(n);
					   int m=map.get(n);
					   //System.out.println(m);
					   if(n%2!=0){
						   sum=sum+m;
					   }
			      }
			   System.out.println("Addition of a Integer values:  "+sum);
			   System.out.println("Average of a Sum:   "+(double)sum/2);
						   
			
			   
		}

	}
