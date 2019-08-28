import java.io.*;
class Search
{ public void lsearch(int a[], int n, int e)
  { int flag=0;
    int i;
     for (i=0;i<n;i++)
    { if(a[i]==e)
       { flag=1; 
      System.out.println("Element found at position " + (i+1));
        }
    }
    if(flag==0)
     
 
     System.out.println("Element not found");
}
 public void bsearch(int ar[],int n, int e)
  {         int temp=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
             a[i]=ar[i];
             for (int i=0; i<n-1;i++)
           { for(int j=0; j<n-1-i;j++)
              if(a[j]>a[j+1])
            { temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
          }
     System.out.println("Sorted Array");
   for(int i=0;i<n;i++)
   { System.out.println(a[i]);
}
    int fl=0;
    int f=0;
    int l=n-1;
    int mid=0;
     while (f<=l)
    { mid=(f+l)/2;
      if (a[mid]==e)
       {fl=1;
       System.out.println("Element found at position " + (mid+1));
       break;
       }
      else if(a[mid]<e)
       f=mid+1;
       else if (a[mid]>e)
       l=mid-1;
    }
  if(fl==0)
  
      System.out.println("Element not found");
  }


 public static void main(String arg[]) throws IOException
{ Search obj=new Search();
  int ch;
  InputStreamReader isr=new InputStreamReader(System.in);  
  BufferedReader br = new BufferedReader(isr);
  System.out.println("Enter the limit");
  int n= Integer.parseInt(br.readLine());
  int arr[]=new int[n];
  System.out.println("Enter the array");
  for (int j=0;j<n;j++)
  arr[j]=Integer.parseInt(br.readLine());
 do
{  System.out.println("Enter the element to be searched");
  int e= Integer.parseInt(br.readLine());
  System.out.println("\nMENU\n--------\n1.Linear Search\n2.Binary Search\nEnter the choice");
  int k= Integer.parseInt(br.readLine());
  switch(k)
  { case 1: obj.lsearch(arr,n,e);
            break;
    case 2: obj.bsearch(arr,n,e);
            break;
   default: System.out.println("Invalid choice");
 }
System.out.println("Do you want to continue,if yes press 1");
 ch=Integer.parseInt(br.readLine());
}while(ch==1);
}
} 
