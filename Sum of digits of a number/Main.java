import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int f=0;
      while(a>0)
      {
        f=f+(a%10);
        a=a/10;
      }
    
      System.out.println(f);
    }
}