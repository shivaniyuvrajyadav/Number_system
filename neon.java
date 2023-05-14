// wjp to check 9 is neon number or not . 
package number;
import java.util.*;
public class neon {
 public static void main(String[] args) {
	//Scanner sc = Scanner
	 int no =9;
	 int sq =no*no;
	 int sum = 0;
	 while(sq!=0) {
		 int d = sq%10;
		 sum = sum+d;
		 sq=sq/10;
	 }
	 if(sum ==no) {
		 System.out.println(no+"is a neon number");
	 }
	 else {
		 System.out.println(no+"is not a neon number");
	 }
 }
 }
 