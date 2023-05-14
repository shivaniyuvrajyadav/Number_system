//Q.write java program to display the prime factors of 12

package number;

public class factor {
	public static void checkprime(int no) {
	int count = 0;
	for(int i=1;i<=no;i++) {
		if (no%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println(no+"is a prime factor");
	}
	}
	
public static void main(String[]args) {
	int no = 12;
	for (int i=1;i<=no;i++) {
		if(no%i==0) {
			checkprime(i);
		}
	}
}
}

//public class factor{
//	public static void main(String[] args) {
//		int no = 12;
//		for(int i = 2;i<=12;i++) {
//			while(no%i==0) {
//			no = no/i;
//			System.out.println(i);
//			}
//		}
//	}
//}
