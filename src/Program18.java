import java.util.ArrayList;
	/*18) input1=1 ,input2=2 ,input3=3 --- output=6;
	    input1=1 ,input2=13,input3=3 --- output=1;
	    input1=13,input2=2 ,input3=8 --- output=8;
	    if value equal to 13,escape the value '13', as well as the next value to 13.
	    sum the remaining values                                                             */

	public class Program18  {
	public static void main(String[] args) {
		
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(13);
			list.add(2);
			list.add(8);
			
			int sum=0;
			for(int i=0;i<list.size();i++)
				if(list.get(i)!=13)
					sum=sum+list.get(i);
				else if(list.get(i)==13)
					i=i+1;
			
			System.out.println(sum);
	     }
	}
