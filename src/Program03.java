
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

	/*3. arraylist of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student who has scored max marks
	 * (total of three)
	input:{"arun#12#12#12","deepak#13#12#12"}
	output:deepak            */
	public class Program03 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] input={"arun#12#12#12","deepak#13#12#12"};
			int n=0,max=0;
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			for(int i=0;i<input.length;i++){
				String s=input[i];
				//System.out.println(s);
				StringTokenizer st=new StringTokenizer(s,"#");
				String s1=st.nextToken();
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int c=Integer.parseInt(st.nextToken());
			      n=a+b+c;
			      map.put(s1, n);
			   }
			System.out.println(map);
			
			  String m=new String();
			  Iterator<String> i=map.keySet().iterator();//By using this iterator object, you can access each element in the collection, one element at a time.
			  while(i.hasNext()){
			   String s4=i.next();
			   int j=map.get(s4);
			   System.out.println(j);
			   if(j>max){
			    max=j;
			    m=s4; 
			    }
			  }
			 System.out.println(m);
			 }
	}
