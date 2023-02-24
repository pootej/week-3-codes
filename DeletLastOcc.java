import java.util.Scanner;
class DeletLastOcc {
 public static void main(String args[]) { 
    int arr[] = { 1,3,44,44,66,7,77,7,77,8,88};
    Scanner s = new Scanner(System.in);
 System.out.println("Enter key value");
 int key = s.nextInt(); 
int index = -1;
for (int i = 0; i < arr.length; i++)
  {
  if (key == arr[i])
  {
    index = i; 
}
}
for (int i = index; i < arr.length - 1; i++)
  {
arr[i] = arr[i + 1];
}
   for (int i = 0; i < arr.length - 1; i++) {
 System.out.print(arr[i] + " ");}
 }
}