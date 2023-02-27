class Mul;
public static void mul(int[][] a, int[][] b)
  {
    int r1 = a.length;
    int c1 = a[0].length;
    int r2 = b.length;
    int c2 = b[0].length;
    int c[][]=new int[r1][c2];
    if(c1==r2)
    {
      for(int i=0;i<r1;i++)
        {
          for(int j=0;j<c2;j++){
            c[i][j]=0;
            for(int k=0;k<c1;k++)
              c[i][j]=c[i][j]+a[i][k]*b[k][j];
          }
        }
    }
    else
      //prints the message matrix multiplication is not possible
  }

