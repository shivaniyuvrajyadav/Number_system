// Q. wjp to check 1124 is spy number or not 
package number;

public class SpyNumber {
			
public static void main(String[] args) {                        //1124
	 int no =1124;
	 int mul=1;
	 int temp =no;
	 int add = 0;
	 while(no!=0) {
		int d = no%10;
		mul =mul*d;
		add = add+d;
		no =no/10;
	 }
	 if(add==mul) {
		System.out.println(temp+"is a spy number");
		
	 }
	 else {
		 System.out.println(temp+"is not a spy number");
	 }
}
}
