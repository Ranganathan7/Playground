import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int num = change(a,b);
    System.out.println(num);
  }
  public static int change(int b,int e)
  {
    int p=1;
    for(int i=1;i<=e;i++)
    {
      p = p*b;
    }
    return p;
  }
}