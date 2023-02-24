class MidElement{
public static void main(String args[]){
int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54};       // array
int start = 0, last= arr.length-1;                // start index will be 0 // last index will be length-1
int mid= start+ (last-start)/2;        //middle index=start+(last index-start index)/2
System.out.println("The middle element in the given array is:"+arr[mid]);
}
 }