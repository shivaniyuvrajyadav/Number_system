//Q. perfect square from 1 - 100 
public class num {
	
	public static void main(String[] args) {
	for(int i = 1;i<=100;i++) {
		perfectsquare(i);
	}
}
	public static void perfectsquare(int number) {
		int temp =0;
		for(int i=1;i<number;i++) {
			if(number%i==0 && i*i==number) {
				temp=i*i;
			}
		}
		
		if(temp==number)
		{
			System.out.println(number+" "+"perfect square");
		}
		
		 
		
	}
}
