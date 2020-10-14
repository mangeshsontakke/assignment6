import java.util.HashMap;
import java.util.Iterator;

	/*15)I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
	   i/p 2="hari";
	   o/p string[]={"ram","cts"};             */
	
	public class Program15 {
	public static void main(String[] args) {
	
			HashMap<String,String> map=new HashMap<String,String>();
			map.put("ram", "hari");
			map.put("cisco", "barfi");
			map.put("honeywell","cs");
			map.put("cts", "hari");
			String input2="hari";
			
			Iterator<String> i=map.keySet().iterator();
			   while(i.hasNext()){
			   String s1=(String) i.next();
			   //System.out.println(s1);
			   String s2=map.get(s1);
			   //System.out.println(s2);
			   if(input2.equals(s2))
			     System.out.print(s1+" ");
			   
			    }	      
		}

	}
