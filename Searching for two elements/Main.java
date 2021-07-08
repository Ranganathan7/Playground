import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = in.nextInt();
      }
      int a = in.nextInt();
      int b = in.nextInt();
      int i1=-1;
      int i2=-1;
      for(int i=0;i<n;i++)
      {
        if(arr[i] == a)
        {
          i1 = i;
        }
        if(arr[i] == b)
        {
          i2 = i;
        }
      }
      System.out.println(i1);
      System.out.println(i2);
    }
}