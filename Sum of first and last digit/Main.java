import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int f=a%10;
      while(a>10)
      {
        a=a/10;
      }
    
      System.out.println(f+a);
    }
}