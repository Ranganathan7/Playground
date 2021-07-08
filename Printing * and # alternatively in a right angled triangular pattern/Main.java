import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int s=1;
    int newline=1;
    int count=0;
    for(int i=2;i<=n;i++)
    {
      s=s+i;
    
    }
   
    for(int i=1;i<=s;i++)
    {
      count=count+1;
      if(i%2==0)
      {
        System.out.print("#");
      }
      else
      {
        System.out.print("*");
      }
      if(count==newline)
      {
        System.out.println();
        newline=newline+1;
        count=0;
      }
    }
  }
}