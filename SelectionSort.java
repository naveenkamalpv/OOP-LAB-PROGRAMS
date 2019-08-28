import java.io.*;
class SelectionSort
{
public static void main(String arg[])throws Exception
	{
	Sort obj=new Sort();
	int arr[]=new int[10];
	int n,i;
	InputStreamReader isr=new InputStreamReader(System.in);  
        BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter the limit ");
	String s=br.readLine();
	n=Integer.parseInt(s);
	System.out.println(" Enter array elements ");
		for(i=0;i<n;i++)
		{
		String s1=br.readLine();
		arr[i]=Integer.parseInt(s1);
		}
	obj.sort(arr,n);
	obj.disp(arr,n);
	}
}
class Sort
{
public static void sort(int arr[],int l)
	{
            for (int i = 0; i < l-1; i++)
		{
			int min = i;
			for (int j = i+1; j < l; j++)
				if (arr[j] < arr[min])
					min= j;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

public static void disp(int arr[],int l)
	{
		System.out.println(" The sorted array is: ");
		for (int i=0; i<l; ++i)
			{
			System.out.print(arr[i]+" ");
			}
		System.out.println();
	}
}



