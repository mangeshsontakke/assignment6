
	/*10. input1={1,2,3}
	input2={3,4,5}
	input3;+(union)
	output:inp1+inp2
	input1:{1,2,3,4,5}
	input 2:{2,3,4,5}
	input3=*(intersection)
	output:inp1*inp2
	INPUT1:{1,2,3,4,5}
	INPUT2:{3,6,7,8,9}
	INPUT3:-(MINUS)
	output:inp1-inp2           */

	public class Program10 {
	public static void main(String[] args) {
			
		char k='*';
		switch(k){
		
		case'+' :
		 
		int[] input1={1,2,3};
		int[] input2={3,4,5};
		    int[] c = new int[input1.length];
		    for (int i = 0; i < input1.length; i++) {
		        c[i] = input1[i] + input2[i];
		        System.out.println(c[i]);
		    }
		    break;
		case '*':
			
			int[] input3={1,2,3,4,5};
			int[] input4={0,2,3,4,5};
			    int[] d = new int[input3.length];
			    for (int i = 0; i < input3.length; i++) {
			        d[i] = input3[i] * input4[i];
			        System.out.println(d[i]);
			    }
			break;
			
	    case '-':
			
			int[] input7={1,2,3,4,5};
			int[] input8={3,6,7,8,9};
			    int[] e = new int[input7.length];
			    for (int i = 0; i < input7.length; i++) {
			        e[i] = input7[i] - input8[i];
			        System.out.println(e[i]);
			    }
			break;
			
		}
			
			
		}

	}
