class MiddleTwoElement{
   public static void main(String[] args){
      int arr[] = {23,90,34,11,44,55};
       
      if (arr.length %2 == 0){
         System.out.println("The middle elements are: ");
        
         int x = arr[(arr.length/2) - 1];
         System.out.println(x);
         int y = arr[arr.length/2];
         System.out.println(y);
      }
   }
}
  
