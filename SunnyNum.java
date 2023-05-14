//Q. wjp to check whether 8 is sunny number or not . 

package day_four;

public class SunnyNum {
	public static void main(String[] args) {
		int no = 8;
		int sq=0;
		int count =0;
		for(int i = 1; i<=no;i++) { //9
			 sq = i*i;  //9
			if((sq-1)==no) { //9-1 =8
				count++;
			}
		}
			if(count==1) { // 1=1 
				System.out.println(no+" "+"is a sunny number");
			}
			else {
				System.out.println(no+" "+"is not a sunny number");
			}
		}
		
	}
 pll
//public class SunnyNum{
//	public static boolean Automorphic(int n) { //25
//		int sq = n*n;         //625
//		while(n!=0) {         //0!=0
//			if(n%10!=sq%10) {       //2%10 =2 62%10=2
//				return false;
//			}
//			n = n/10;     //2/10=0
//			sq = sq/10;   //62/10=6
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		int no = 25;
//		System.out.println(Automorphic(no)?no+"is automorphic":no+"is not automorphic");
//	}
//}
// 
 

