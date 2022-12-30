import java.util.*;
class Sorting
{
	public static void main(String args[])
	{
	
		Scanner sx = new Scanner(System.in);
		int a[] = new int[20];
		int size,i,j,t;

		System.out.println("Enter the Size upto 20");
		size = sx.nextInt();
		
		System.out.println("Enter the Element one by one:");
		for(i=0;i<size;i++)
		{

			a[i] = sx.nextInt();
		}

		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					t	 = a[i];
					a[i]	 = a[j];																																		
					a[j] 	 = t;
				}
			}
		}
	
		System.out.println("After Sorting Elements:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
			
		}

	}
}

