import java.util.Scanner;
class NoPresentOrNot{
   public static void main(String args[]) {
  Scanner s = new Scanner(System.in);
  int arr[] = {1,2,3,4,5,6,7};
     int count=0;
   System.out.println("Enter number to check if its present or not");
   int num=s.nextInt();
     for(int i=0;i<arr.length;i++){
       if(num==arr[i]){
         count++;
         break;
       }
     }
       if(count>0){
         System.out.println("Entered number is present ");
       }
       else{
         System.out.println("Entered number is not present ");
       }
       
     }
}

