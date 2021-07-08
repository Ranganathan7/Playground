import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      while(a>100)
      {
        a=a/10;
      }
      a=a%10;
      System.out.println(a);
    }
}