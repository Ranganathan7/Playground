
import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int res = 0;
    Stack<Integer> s = new Stack<Integer>();
    s.add(-1);
    int n = str.length();
    for(int i=0;i<n;i++){
      if(str.charAt(i)=='(') s.add(i);
      else{
        if(!s.empty()){
          s.pop();
          if(!s.empty()) res = Math.max(res, i - s.peek());
          else s.add(i);
        }
      }
    }
    System.out.println(res);
  }
}