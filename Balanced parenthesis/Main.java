import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Stack<Character> st= new Stack<Character>();
    String s;
    int flag = 0;
    Scanner in = new Scanner(System.in);
    s = in.nextLine();
    for(char c:s.toCharArray()){
      if(c=='{' || c=='[' || c=='('){
        st.push(c);
      }
      else if(c=='}' || c==']' || c==')'){
        if(st.empty()){
          flag = 1;
          break;
        }
        else{
          
          if(c==')' && st.pop()=='(') continue;
          else if(c=='}' && st.pop()=='{') continue;
          else if(c==']' && st.pop()=='[') continue;
          else{
            flag = 1;
            break;
          }
        }
      }

    }
    if(st.empty()==false) flag = 1;
    if(flag==1) System.out.println("Not Balanced");
    else System.out.println("Balanced");
  }
}