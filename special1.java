//Q. wjp to check special number from 1 to 1000
public class special1 {
 
	 public static void main(String[] args) {
			for(int i = 1;i<=1000;i++) {
				specialnumber(i);
			}
		}
			public static void specialnumber(int no) {
				
				int temp = no; //19
				int add = 0;
				int mul = 1;
				int sum = 0;
				while(no!=0)//0!=0
				{
				  int d = no%10; //1
				  add = add+d; //10
				  mul = mul*d; //9
				  sum = add+mul; //19
				  no = no/10;
				  
				}
				if(sum ==temp)//19==19
				{
				 System.out.println(temp +"is a special number");	
				}
	 
			}
	 
 }

