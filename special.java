// Q wjp to check whether the 19 is special number or not 
public class special {
 public static void main(String[] args) {
int no =19;
int temp = no; //19
int add = 0;
int mul = 1;
int sum = 0;
while(no!=0)//0!=0
{
  int d = no%10; //1
  add = add+d; //10
  mul = mul*d; //9
  sum = add+mul; //19
  no = no/10;
  
}
if(sum ==temp)//19==19
{
 System.out.println(temp +"is a special number");	
}
else {
	System.out.println(temp+"is not a special number");
}
}
}
