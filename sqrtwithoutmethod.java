package day_three;

public class sqrtwithoutmethod {
public static void main(String[] args) {
	int no = 9;
	int sr = no/2;
	int temp;
	do {
		temp =sr;
		sr = (temp+(no/temp))/2;
		}while((sr-temp)!=0);
	System.out.println(sr);
}
}
