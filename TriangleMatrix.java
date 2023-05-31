import java.util.*;
class TriangleMatrix
{
    int mat[][],n;
    TriangleMatrix(int nn)
    {
        n=nn;
        mat=new int[n][n];
    }
    void input()
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    void UpperTriangle()
    {
        int i,j;
        System.out.println("Upper Triangle==>");
       
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==j||i==0||j==n-1)
                    {
                         System.out.print(mat[i][j]+"\t");
                    }                    
                }          
            }
           System.out.println();  
        }
        void LowerTriangle()
        {
            int i,j;
            System.out.println("Lower Triangle==>");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(j==0||i==n-1||i==j)
                    {
                        System.out.print(mat[i][j]+"\t");
                    }
                }
            }
            System.out.println();
        }
       void display()
       {
           int i,j;
           System.out.println("Original Matrix");
           for(i=0;i<n;i++)
           {
               for(j=0;j<n;j++)
               {
                   System.out.print(mat[i][j]+"\t");
               }
               System.out.println();
           }
       }
       public static void main(String[]args)
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of rows and columns");
           int x= sc.nextInt();
           TriangleMatrix obj=new TriangleMatrix(x);
           obj.input();
           obj.display();
           obj.UpperTriangle();
           obj.LowerTriangle();
       }
    }