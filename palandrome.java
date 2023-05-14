// Q. wjp to display 313 is palindrome or not 
public class palandrome {
	public static void main(String[] args) {
		int no = 313;
		int reversenumber = 0;
		 int rem = 0;
		 int temp = no;
		while(no> 0)//313>0
		{
			rem =no%10;
		reversenumber = reversenumber*10+rem;
		 no =no/10;
		}
		if (temp==reversenumber) {
			System.out.println(temp+"number is palindrome");
		} else {
            System.out.println(temp+"number is not palindrome");
		}
	}
}
