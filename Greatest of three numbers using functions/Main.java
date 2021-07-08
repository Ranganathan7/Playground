import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int max = 0;
      if(a>b)
      {
        if(a>c)
        {
          max = a;
        }
        else{max=c;}
      
      }
      else{
        if(b>c){max=b;}
        else{max=c;}
      }
      System.out.println(max);
	}
}