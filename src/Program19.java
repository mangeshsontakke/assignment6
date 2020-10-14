
import java.util.ArrayList;
import java.util.List;

	/*19)Collect no’s frm list1 which is not present in list2 
	    & Collect no’s frm list2 which is not present in list1
	    and store it in output1[].
	    ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};    */
	
	public class Program19 {

		/*public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] input1={1,2,3,4};
			int[] input2={1,2,3,5}; 
			int i=0;
			for( i=0;i<input1.length;i++){
				for( i=i+0;i<input2.length;i++){
					if(input1[i]!=input2[i]){
						System.out.println(input1[i]);
						System.out.println(input2[i]);
					}
				}
			}	
					
		}*/
		
		
		
		public static void main(String[] args) {
		      ArrayList<Integer> l1=new ArrayList<Integer>();
		      l1.add(1);
		      l1.add(2);
		      l1.add(3);
		      l1.add(4);
		      System.out.println(l1);//[1, 2, 3, 4]
		      List<Integer> l2=new ArrayList<Integer>();
		      l2.add(1);
		      l2.add(2);
		      l2.add(3);
		      l2.add(5);
		      System.out.println(l2);//[1, 2, 3, 5]
		     
		      List<Integer> l3=new ArrayList<Integer>();
		      l3.addAll(l1);
		      List<Integer> l4=new ArrayList<Integer>();
		      l4.addAll(l2);
		      
		      l1.removeAll(l2);
		      System.out.println(l1);//[4]
		      
		      l4.removeAll(l3);
		      System.out.println(l4);//[5]
		      
		      l1.addAll(l4);
		      System.out.println(l1);//	[4, 5]
		      

	}

	}
