import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      for(int i=1;i<=m;i++)
      {
        for(int j=1;j<=m;j++)
        {
          System.out.print(i);
        }
        System.out.print("\n");
      }
	}
}