import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int on,rem,result=0;
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      on=num;
      while(on!=0)
      {
        rem=on%10;
        result+=rem*rem*rem;
        on/=10;
      }
      if(result==num)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}