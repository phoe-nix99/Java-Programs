import java.util.*;
class ArrayCheck2
{
	int x[][];  // reference - 2d array
	int r,c; // total no of elements
	ArrayCheck2(int row,int col)
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
	void maxmin()
	{
		int m=x[0][0];
		int n=x[0][0];
	
		for(int i=0;i<r;i++)
		{
		  for(int j=0;j<c;j++)
		  {
			if(x[i][j]>m)
				m=x[i][j];
			if(x[i][j]<n)
				n=x[i][j];
		  }
		}
		System.out.println("Max = "+m);
		System.out.println("Min = "+n);
	}
	void search(int data)
	{
		int flag=0;
		for(int i=0;i<r;i++)
		{
            for (int j=0;j<c;j++){
			if(x [i] [j]==data){
				System.out.println(data+" is found at "+i+" "+j);
				flag++;
				break;
			}
			}
		}
		if (flag==0){
			System.out.println("Data not found");
		}
		    }



	/*void sort()
	{
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(x[j]>x[j+1])
				{
				 int temp=x[j];
				 x[j]=x[j+1];
				 x[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array is -");
		for(int i=0;i<size;i++)
			System.out.print(x[i]+" ");
	}
	*/
}
public class Twod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of rows");
		int y=sc.nextInt();
		System.out.println("Enter total no of columns");
		int b=sc.nextInt();
		ArrayCheck2 obj=new ArrayCheck2(y,b);
		obj.set_array();
		obj.maxmin();
		System.out.println("Enter an element to search");
		int d=sc.nextInt();
		obj.search(d);
		/*obj.sort();
		*/
	}

}