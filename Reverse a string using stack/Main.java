import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Stack<Character> s = new Stack<Character>();
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    for(char c:str.toCharArray()){
      s.add(c);
  }
    while(s.empty()==false) System.out.print(s.pop());
  }
}