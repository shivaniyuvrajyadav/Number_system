//Q. wjp to check all the strong number in range 1-1000
package number;
//wajp to check all the strong no in range 1-1000...

public class Strongrange {

public static void main(String[] args) {

//TODO Auto-generated method stub

for (int i=1;i<=100;i++) {

range(i);}

}

public static void range(int no) {

//TODO Auto-generated method stub

//int no = 145; //145

int temp=no;

int sum=0;

while(temp!=0) //0!=0

{

int d=temp%10;

int factorial =factorial(d);

sum=sum+=factorial;

temp=temp/10;

}

if(sum==no) {

System.out.println(no+"is a strong number");

}

}

public static int factorial(int d) //4

{

int fact =1;

for (int i=1;i<=d;i++) //6<=5

{

fact=fact*i; //120

}

return fact; //1

}

}