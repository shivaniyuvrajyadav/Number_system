//Q wja to check whether number is perfect square or not 
public class number {
	
	public static void main(String[]args) {
		int no = 9;
		int temp =0;
		for(int i=1;i<=no;i++) {
			if(no%i==0 && i*i==no) {//9%3 ==0 9=9  9
				 temp=i*i;
			}
		}
		
		if(temp==no)
		{
			System.out.println(no+" "+"perfect square");
		}
		else {
			System.out.println(no +"not a perfect square");
		}
		
	}
	
	

}
