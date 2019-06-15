import java.util.Scanner;
class Main{
  public static int add(int m)
  {
    int sum=0;
    for(int i=0;i<=m;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
 
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int  a=add(n);
      System.out.print(a);
        
     
	}
}