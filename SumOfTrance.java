// ROW1 123
//ROW2  456
//TRANCE  NUMBER ARE WHERE I=J THOSE ARE 1 AND 5 AS 1 HAS [1][1] AND 5 HAS [2][2]
class SumOfTrance{
public static void main(String[] args) {

  int sum=0;
int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

for (int i = 0; i < arr.length; i++)
{
   for(int j=0;j<arr[i].length;j++)
   
   if(i==j){
      sum=sum+arr[i][j];
}
}
  
  System.out.println("sum is "+sum);

}
}