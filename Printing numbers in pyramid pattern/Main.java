import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
     int value=1;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int sp=n;sp>i;sp--)
        {
          System.out.print(" ");
        }
        for(int p=1;p<=i;p++)
        {
          System.out.print(value+" ");
         value++;
        }
        System.out.print("\n");
      }
    }    
}