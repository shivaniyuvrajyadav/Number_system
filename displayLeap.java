//Q. wajp to display 1996 is leap year or not. 

package day_three;

public class displayLeap {
public static void main(String[] args) {
	int y=1996;
	if(y%4==0) {
		if(y%100!=0 || y%400==0)
		{
			System.out.println(y+"is a leap year");
		}
		else {
			System.out.println(y+"is not leap year");
		}
	}
}
}
