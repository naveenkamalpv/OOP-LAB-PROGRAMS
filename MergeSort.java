import java.io.*;

class Sort

{
	
		
 void Merge(int arr[], int l, int m, int r) 

 { 
		        
	
	int a = m - l + 1; 
		    
        int b = r - m; 
		  
		     
		 
        int C[] = new int [a]; 
		      

     	int D[] = new int [b]; 
		
  
		       
		   
    	for (int i=0; i<a; ++i) 
		 
          C[i] = arr[l + i]; 
		  
      	for (int j=0; j<b; ++j) 
		     
          D[j] = arr[m + 1+ j]; 
		  

		  
		      
		
        int i = 0, j = 0; 
		  
	
	    
		      
        int k = l; 
		       
        while (i < a && j < b) 
	
    { 
		     
         if (C[i] <= D[j]) 
		
            { 
		               
             arr[k] = C[i]; 
		    
             i++; 
		     
            } 
		         
          else
		         
            { 
		            
            arr[k] = D[j]; 
	
	    j++; 

            } 

           k++; 

     } 
	
   while (i < a) 
		      
  { 
		           
  arr[k] = C[i]; 
		  
  i++; 
		          
  k++; 
		      
  } 
		  
		       
		
        while (j < b) 
		   
     { 
		           
       arr[k] = D[j]; 
		    
       j++; 
		          
       k++; 
		      
     } 
		  
 } 
		  
		   
	
	   
 void mergeSort(int arr[], int l, int r) 
	
 { 
		       
 if (l < r) 
	
 { 
		            
		  
     int m = (l+r)/2; 
		  
	
     mergeSort(arr, l, m); 
	
     mergeSort(arr , m+1, r); 
		  
		
     Merge(arr, l, m, r); 
		  
   } 
		  
  } 
	
	

}


public class MergeSort
{
	
public static void main(String[] args)throws IOException
	
{
		
InputStreamReader isr=new InputStreamReader(System.in);  
BufferedReader br = new BufferedReader(isr);
System.out.println("\nEnter the number of elements in the array:");
	
int size= Integer.parseInt(br.readLine());
		
System.out.println("\nEnter the array elements:");
		
int arr[]= new int[30];
		
for(int i=0; i<size;i++)
			
arr[i]= Integer.parseInt(br.readLine());
		
		
System.out.println("\nThe initial array is ");
		
for(int j=0; j<size;j++)
			
System.out.println(arr[j] + " ");
		
		
		
	
int a[]= new int[30];
		
for( int k=0; k<size; k++)
			
a[k]= arr[k];
		
		
		
Sort Merge= new Sort();
		
Merge.mergeSort(a,0,size-1);
	
		
		
System.out.println("\nThe sorted array  is: ");
		
for( int l=0; l<size; l++)
			
System.out.println(a[l] + " ");
	
}
	



}

