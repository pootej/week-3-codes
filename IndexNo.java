import java.util.Scanner;

class IndexNo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = { 23, 45, 12, 90, 55, 33, 23, 44, 44, 55, 55, 55 };
    int temp=0;
    System.out.println("enter number to find its index value");
    int num = s.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num){
        temp=i;
         break;
      } 
      
        System.out.println("its index value is " + temp);
      
    }
  }
}
