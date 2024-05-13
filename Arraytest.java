import java.util.*;
class ArrayCheck1
{
	int x[][];  // reference - 2d array
	int r,c; // total no of elements
	ArrayCheck1(int row,int col)
	{
		r=row;
		c=col;
		x=new int[r][c];  // memory allocation
	}
	void set_array()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+r*c+" no of elements");
		for(int i=0;i<r;i++)     //row-wise(major) read
		{
			for(int j=0;j<c;j++)
			{
			  x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Given 2d Array -");
		for(int i=0;i<r;i++)     //row-wise(major) print
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}





public class Arraytest {
    public static void main(String[] args) {
        
        ArrayCheck1 obj = new ArrayCheck1(3,3);

        obj.set_array();
    }
    
}
