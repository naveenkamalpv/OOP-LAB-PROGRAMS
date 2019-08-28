


import java.io.*;
public class BubbleSort
{
public static void main (String args[]) throws IOException
 { 
InputStreamReader isr=new InputStreamReader(System.in);  
BufferedReader br = new BufferedReader(isr);
  System.out.println("Enter the limit");
  int n= Integer.parseInt(br.readLine());
  int arr[]=new int[n];
  System.out.println("Enter the array");
  for (int i=0;i<n;i++)
  arr[i]=Integer.parseInt(br.readLine());

  BubbleSortfn obj= new BubbleSortfn();

   int a[]=new int[n];
   for(int j=0;j<n;j++)
   a[j]=arr[j];

   System.out.println("Initial Array:");
   for(int i=0;i<n;i++)
   System.out.println(a[i]);
    

  obj.sort(a,n);
  System.out.println("Sorted Array:");
   for(int i=0;i<n;i++)
   System.out.println(a[i]);
	}
}




class BubbleSortfn
{

 public int sort(int ar[],int n)
{ int temp=0;
  for (int i=0; i<n-1;i++)
   { for(int j=0; j<n-i-1;j++)
      if(ar[j]>ar[j+1])
      { temp=ar[j];
        ar[j]=ar[j+1];
        ar[j+1]=temp;
      }
   }
return 0;
}    
}








