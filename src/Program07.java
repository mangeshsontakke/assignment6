
/*7.A integer input is accepted.find the square of individual digits and find their sum.
input:125
output:1*1+2*2+5*5
 */
public class Program07 {

	public static void main(String[] args) {

		int no = 125;
		int rem = 0 ;
		int add=0;//25+4+1 = 30
		while(no!=0) {// no=125 / 12 /  1
			rem = no % 10;//5 , 2 , 1 
				
			add=add +(rem * rem);// 5*5, 2*2 , 1*1  = 25+4+1 = 30
			
				no = no/10;// remind = 12 , 1 , 0 --> last 5 is skip -->no=125 / 12 / 1
		
		}	System.out.println(add);
	}
}