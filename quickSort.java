


import java.io.*;


class quick
{
 int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low); 
        for (int j=low; j<high; j++) 
        { 
            
            if (arr[j] <= pivot) 
            { 
               
  
              
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
	        i++; 
            } 
        } 
  
        
        int temp = arr[i]; 
        arr[i] = arr[high]; 
        arr[high] = temp; 
  
        return i; 
    } 
  
  
    
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int pi = partition(arr, low, high); 
  
            
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 


}







public class quickSort {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the number of elements in the array:");
		int size= Integer.parseInt(br.readLine());
		System.out.println("\nEnter the elements of the array:");
		int arr[]= new int[30];
		for(int i=0; i<size;i++)
		        arr[i]= Integer.parseInt(br.readLine());
		
		System.out.println("\nThe entered array is ");
		for(int j=0; j<size;j++)
			System.out.println(arr[j] + " ");
		
		
		
		int a[]= new int[30];
		for( int k=0; k<size; k++)
			a[k]= arr[k];
		
		quick ob = new quick(); 
                ob.sort(a, 0, size-1); 
  
  
		System.out.println("\nThe sorted array after quick sort is: ");
		for( int l=0; l<size; l++)
			System.out.println(a[l] + " ");
	}
}