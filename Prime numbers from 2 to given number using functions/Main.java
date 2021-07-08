import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    change(a);
   
  }
  public static void change(int b)
  {
    int p = 0;
    for(int i=2;i<=b;i++)
    {
      p = 0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          p=p+1;
        }
      }
      if(p<=2)
      {
        System.out.println(i);
      }
    }
  }

  }
