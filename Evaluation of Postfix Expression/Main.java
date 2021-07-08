import java.util.*;
import java.io.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    in.nextLine();
    for(int i=0;i<t;i++){
      Stack<Integer> s = new Stack<Integer>();
      String str = in.nextLine();
      for(char c:str.toCharArray()){
  
        if(c=='/' || c=='*' || c=='+' || c=='-') {
          
          int op1 = s.pop();
          int op2 = s.pop();
          int res;
          if(c=='/') res = op2/op1;
          else if(c=='+') res = op2+op1;
          else if(c=='-') res = op2-op1;
          else res = op2*op1;
    
          
          s.add(res);
        }
        else{
          s.add(Character.getNumericValue(c));
        }
      }
      System.out.println(s.pop());
    }
    
  }
}