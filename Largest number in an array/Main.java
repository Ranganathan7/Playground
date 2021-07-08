import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int num = 0;
      for(int i=0;i<n;i++)
      {
        arr[i] = in.nextInt();
        if(num < arr[i])
        {
          num = arr[i];
        }
      }
      System.out.println(num);
    }
}