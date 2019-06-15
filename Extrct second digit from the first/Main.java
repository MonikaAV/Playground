import java.util.Scanner;
public class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int last=n%10;
    while(n>=100)
    {
      n=n/10;
    }
   int second=n%10;
    System.out.println(second);
    
  }
}