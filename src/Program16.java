import java.util.ArrayList;

	/*16)Input1={“ABX”,”ac”,”acd”};
	   Input2=3;
	   Output1=X$d              */
	public class Program16 {

		public static void main(String[] args) {
		
		String[] input1={"ABX","ac","acd"};
			  int input2=3;
			ArrayList<String> list=new ArrayList<String>();
			for(String s:input1)
	            if(s.length()==input2)
	            list.add(s);
			//System.out.println(list);//[ABX, acd]
			
			StringBuffer sb=new StringBuffer();
			for(String a:list){
				String s1=a.substring(a.length()-1);
			//	System.out.println(s1);//X,d
				sb.append(s1).append("$");
				//System.out.println(sb);//X$d$
			}
				sb.deleteCharAt(sb.length()-1).toString();
			      System.out.println(sb); //X$d
		}

	}
	