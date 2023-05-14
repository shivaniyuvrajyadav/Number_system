//Q . count the even digit of a number. 
package day_three;

public class counteven {
	public static void main(String[] args) {
		int no = 1234;
		int count = 0;
		while(no!=0) {
			int d = no%10;
			if(d%2==0) {
			count++;
			
		}
			no = no/10;
		
	}
		System.out.println(count);
	}
}
