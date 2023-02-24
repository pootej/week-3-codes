class SumOddEvenCount{
  public static void main(String args[]){
    int esum=0,osum=0,ecount=0,ocount=0,sum=0;
    int arr[]={20, 23, 40, 42, 20, 51};
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        esum=esum+arr[i];
        ecount++;
      }
      else{
        osum=osum+arr[i];
        ocount++;
      }
      sum=sum+arr[i];
      
      }
    System.out.println("Even sum:"+esum);
    System.out.println("Odd sum:"+osum);
    System.out.println("Even count:"+ecount);
    System.out.println("Odd count:"+ocount);
    System.out.println("Sum of all elements:"+sum);
}
 }