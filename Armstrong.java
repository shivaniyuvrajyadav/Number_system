// Q write a java program to check 153 is armstrong number or not . 

package day_three;
public class Armstrong {
public static void main(String[] args) {
int no = 370;
int temp = no;
//count(no);
//int p =count(no);
int sum = 0;
while(temp!=0) {
	int d = temp%10;
//	int numbertothepower = power(d,p);
	sum = sum+(d*d*d);
	temp = temp/10;
}
if(no==sum) {
	System.out.println(no +" "+ "is a armstrong number");
} 
else {
	System.out.println(no+"it is not a armstrong number");
}
}
//public static int count(int no) {
//	int c = 0;
//	while(no!=0) {
//		c++;
//		no = no/10;
//	}
//	return c;
//}
//public static int power(int n ,int p) {
//	int mul = 1;
//	for(int i=1;i<=p;i++) {
//		mul=mul*n;
//	}
//	return mul;
//}
}
