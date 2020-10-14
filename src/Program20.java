import java.util.StringTokenizer;

	/*20) input-- String input1="AAA/abb/CCC"
	    char input2='/'
	    output-- String[] output1;
	    output1[]={"aaa","bba","ccc"};

	    operation-- get the strings from input1  using stringtokenizer
	                reverse each string
	                then to lower case
	                finally store it in output1[] string array          */

	public class Program20 {

		public static void main(String[] args) {
			
			String input1="AAA/abb/CCC";
			char input2='/';
			StringTokenizer st=new StringTokenizer(input1,"/");
			String s1=st.nextToken();
			String s2=st.nextToken();
			String s3=st.nextToken();
			StringBuffer sb=new StringBuffer(s2);
			StringBuffer s4=sb.reverse();
			//System.out.println(s4);
			
			StringBuffer ss=new StringBuffer();
			ss.append(s1.toLowerCase()+",").append(s4+",").append(s3.toLowerCase());
			System.out.println(ss);

		}

	}
