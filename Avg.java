class Avg{
public static void main(String[] args) {
int sum=0;
int avg=0;
int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
for (int i = 0; i < arr.length; i++){
{
for (int j = 0; j < arr[i].length; j++)
sum=sum+arr[i][j];
}
}
  avg=sum/(arr.length);
    System.out.println(" avg is "+avg);
}
}