public class InsertionSort {
 
	
    public static void main(String a[])
    {    
        double[] myArray  = {87.60,37.32,29.50,93.93};  
        
        System.out.println("Before Insertion Sort");  
        
        printArray(myArray);
            
        insertionSort(myArray);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");  
        
        printArray(myArray);   
    }    
 public static void insertionSort(double[] arr) 
	{  
        int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            double key = arr[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( arr [j] > key ) ) 
            {  
            System.out.println("Comparing "+ key  + " and " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr);
        }  
    }
 static void printArray(double[] arr){
	    
	    for(int i=0; i < arr.length; i++)
		{  
			System.out.print(arr[i] + " ");  
		} 
	    System.out.println();
	    
	}
}
