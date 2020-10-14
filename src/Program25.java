import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

	/*25)HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
	    String[] input2={“speaker”,”mouse”};
	    Float output=600.80(500.6+100.2);        */

	public class Program25 {
	public static void main(String[] args) {
	
			 HashMap<String,String> map=new HashMap<String,String>();    
			   map.put("mouse","100.2");  
			   map.put("speaker","500.6");    
			   map.put("Monitor","2000.23"); 
			   
			   String[] input2={"speaker","mouse"}; 
			   Float f=0f;
			   
			   Iterator<String> i=map.keySet().iterator();
			   while(i.hasNext()){
			   String s1=(String) i.next();
			   Float f1=Float.parseFloat(map.get(s1));
			   System.out.println(f1);
			   for(int j=0;j<input2.length;j++){
			    if(input2[j].equals(s1))
			     f=f+f1;
			    }
			   }
			   System.out.println("Addition of input2 Values is:   "+f);
			   
			 }

	}
