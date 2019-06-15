import java.util.Scanner;
class Main{
  public static int greater(int m,int n,int p)
  {
    if(m>n&&m>p)
      return m;
    else if(n>m&&n>p)
      return n;
    else
      return p;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int g=greater(n1,n2,n3);
      System.out.print(g);
	}
}