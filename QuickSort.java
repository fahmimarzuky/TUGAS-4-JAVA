public class QuickSort {
    static void quickSort (double a[], int lo, int hi){
    //  lo adalah index bawah, hi adalah index atas
    //  dari bagian array yang akan di urutkan
        int i=lo, j=hi;
		double h;
        double pivot=a[lo];

    //  pembagian
        do{
            while (a[i]<pivot) i++;
            while (a[j]>pivot) j--;
            if (i<=j)
            {
                h=a[i]; a[i]=a[j]; a[j]=h;//tukar
                i++; j--;
            }
        } while (i<=j);

    //  pengurutan
        if (lo<j) quickSort(a, lo, j);
        if (i<hi) quickSort(a, i, hi);
    }

    
    public static void main(String[] args) {
        double[] tabInt={24.5,17.60,18.45,15.40,22.35,26.89, 13.37, 21.50, 16.80, 28.90};
        int i,n=10;
        System.out.println("Data Sebelum  Di Sorting");
            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+ " ");
           }
            System.out.print("\n");
        quickSort(tabInt,0,n-1);
        System.out.println("Data Setelah Di Sorting");
        for(i=0;i<n;i++){
            System.out.print(tabInt[i]+" ");
        }

    }

}

