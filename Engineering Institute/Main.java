import java.util.Scanner;//import required packages

class Faculty
{
  public void salary(int basesalary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+basesalary);
  }
}
class CSE extends Faculty
{
  public void salary(int basesalary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(basesalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int basesalary)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(basesalary+5000));
  }
}
class ECE extends IT
{
  public void salary(int basesalary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(basesalary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
   
    //implement your required concept here
    Scanner sc = new Scanner(System.in);
    int baseSalary = sc.nextInt();
    if(baseSalary > 0)
    {
    Faculty obj1 = new Faculty();
    obj1.salary(baseSalary);
    CSE obj2 = new CSE();
    obj2.salary(baseSalary);
    IT obj3 = new IT();
    obj3.salary(baseSalary);
    ECE obj4 = new ECE();
    obj4.salary(baseSalary);
    
    }
    else
    {
      System.out.println("null");
    }
    
  }
}