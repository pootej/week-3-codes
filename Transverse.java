// should make in seperate row and column
class Transverse{
public static void main(String[] args) {

int arr[][]={{1,3,4},{2,4,3},{3,4,5}}; 
  int newarr[][]=new int[3][3];
  for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
newarr[i][j]=arr[j][i];{
  System.out.println(" "+newarr[i][j]);   
}
}   
}    
System.out.println();   
}
}    
