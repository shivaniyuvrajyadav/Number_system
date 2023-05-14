// q.write a java program to reverse 1223.
public class reverse {
 public static void main(String[] args) {
	int no = 1223;
	int reversenumber = 0;
	 int rem = 0;
	 int temp = no;
	while(no> 0)//1223>0
	{
		rem =no%10;
	reversenumber = reversenumber*10+rem;
	 no =no/10;
	}
	System.out.println("the reverse of the number "+temp+"is"+reversenumber);
}
}
