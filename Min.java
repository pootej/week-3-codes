class Min {   
public static void main(String args[]){     
int arr[]={23,45,12,90,55,33,10,24,78,45};       
int max=0, min=0;        
max=arr[0];    
min=arr[0];        
for(int i=1;i<arr.length;i++){     // printing all the array   
if(max<arr[i]){                    //23<45 //45<12       
max=arr[i];                        //45   
}                           
if(min>arr[i]){                  //23 // 12
min=arr[i];        
}
}
  System.out.println("Minimum value:"+min);
}
}