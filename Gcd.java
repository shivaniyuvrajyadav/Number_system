//Q. wjp to display the gcd of 12,8 . 

package day_four;

public class Gcd {
	public static void main(String[] args) {
int no1 = 12;
int no2 = 8;
int gcd = 0;

for (int i=1;i<=no1 && i<=no2;i++) {
	
if(no1%i==0 && no2%i==0) {
	gcd = i;
}
}
System.out.println(gcd);
}
}
	
