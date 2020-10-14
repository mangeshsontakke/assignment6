import java.util.ArrayList;
import java.util.List;

	/*21)input1-List1-{apple,orange,grapes}
	    input2-List2-{melon,apple,mango}
	    output={mango,orange}
	    operation-- In 1st list remove strings starting with 'a' or 'g'
	                In 2nd list remove strings ending with 'n' or 'e'
	    Ignore case, return in string array                */

	public class Program21  {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> list1=new ArrayList<String>();
			 list1.add("apple");
			 list1.add("orange");
			 list1.add("grapes");
			 ArrayList<String> l3=new ArrayList<String>();
			 for(int i=0;i<list1.size();i++){
			  String s1=list1.get(i);
			 if(s1.charAt(0)!='a' && s1.charAt(0)!='A' && s1.charAt(0)!='g' && s1.charAt(0)!='G')
			   l3.add(s1);
			  }
	//	System.out.println(l3);//[orange]
		
		 ArrayList<String> list2=new ArrayList<String>();
		 list2.add("melon");
		 list2.add("apple");
		 list2.add("mango");
		 for(int i=0;i<list2.size();i++){
			  String s1=list2.get(i);
			  if(s1.charAt(s1.length()-1)!='n' && s1.charAt(s1.length()-1)!='N' && s1.charAt(s1.length()-1)!='e' && s1.charAt(s1.length()-1)!='E')
			   l3.add(s1);
			  }
		 System.out.println(l3);//[orange, mango]
				
		}
	}

