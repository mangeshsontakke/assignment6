import java.util.ArrayList;

	/*17)String[] input={"100","111","10100","10","1111"} input2="10"
	   output=2;count strings having prefix"10" but "10" not included in count
	   operation-- for how many strings input2 matches the prefix of each string in input1  
	   String[] input={"01","01010","1000","10","011"}
	   output=3; count the strings having prefix"10","01" but "10","01" not included                      */
	
	public class Program17 {

		public static void main(String[] args) {
			
			//String[] input={"100","111","10100","10","1111"};
			
			String[] input={"01","01010","1000","10","011"};
			String input2="10";
			int n=0;
			ArrayList<String> list=new ArrayList<String>();
			for(String s:input)
				//if(s.startsWith(input2)&& s.length()>2)
					if(s.startsWith(input2)||s.startsWith("01") && s.length()>2)
					list.add(s);
			n=list.size();
			System.out.println(n);

		}

	}
