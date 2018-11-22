public class MergeSort {
    
  public static void main(String args[])
{

System.out.println("Merge Sorting");
System.out.println();

     //Nomor yang akan di urutkan
     double n[] = {12.6,53.2,91.2,63.60,79.73,54.50,90.37,22.36};
     
     System.out.println("Sebelum di Urutkan = ");
     for(int i = 0; i < n.length; i++)
     {
        System.out.print(n[i]+" ");
     }
     System.out.println();
      
     initializemergeSort(n,0,n.length-1);
     System.out.println();   
     System.out.println("Setelah di Urutkan = ");
     for(int i = 0; i < n.length; i++)
     {
        System.out.print(n[i]+" ");
     }

}
   public static void initializemergeSort(double[] n, int l, int h)
  { 
     int low = l;
     int high = h;
     if (low>=high)
     {
        return;
     }
     int middle=(low+high)/2;
     initializemergeSort(n,low,middle);
     initializemergeSort(n,middle+1,high);
     int end_low=middle;
     int start_high=middle+1;
     while ((l<=end_low) && (start_high<=high))
     {
        if (n[low]<n[start_high])
        {
           low++;
        }
        else
      {
           double Temp=n[start_high];
           for (int k=start_high-1;k>=low;k--)
           {
              n[k+1]=n[k];
           }
           n[low]=Temp;
           low++;
           end_low++;
           start_high++;
      }
    }
  }  
}
