import java.util.Arrays;

public class QuickSort
{
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void quickSort(int arr[], int beginIndex, int endIndex){
        if(beginIndex >= endIndex){
            return;
        }

        int pivot = arr[endIndex];
        int j = beginIndex-1;

        for(int i=beginIndex; i<endIndex; i++){
            if(arr[i] < pivot){
                j++;
                swap(arr, i, j);
            }
        }

        j++;
        swap(arr, endIndex, j);

        quickSort(arr, beginIndex, j-1);
        quickSort(arr, j+1, endIndex);
    }

    public static void main(String args[])
    {
        int arr[] = {11,16,8,7,20,4,14};
        int n = arr.length;

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, n-1);

        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
    /* java'yı içe aktar kullanışlı _ diziler ;

genel  sınıf  QuickSort
{
    geçersiz  takas ( int  dizi [], int  ben , int  j ) {
        int  sıcaklık = dizi [ ben ];
        dizi [ ben ] = dizi [ j ];
        dizi [ j ] = sıcaklık ;
    }

    geçersiz  hızlı Sıralama ( int  dizi [], int  startIndex , int  endIndex ){
        eğer ( beginIndex >= endIndex ){
            dönüş ;
        }

        int  pivot = dizi [ endIndex ];
        int  j = startIndex - 1 ;

        for ( int  ben = beginIndex ; i < endIndex ; i ++){
            eğer ( dizi [ ben ] < pivot ){
                j ++;
                takas ( arr , i , j );
            }
        }

        j ++;
        takas ( arr , endIndex , j );

        hızlı Sıralama ( arr , startIndex , j - 1 );
        hızlı Sıralama ( dizi , j + 1 , endIndex );
    }

    genel  statik  geçersiz  ana ( String  args [])
    {
        int  dizi [] = { 11 , 16 , 8 , 7 , 20 , 4 , 14 };
        int  n = dizi . uzunluk ;

        QuickSort  qs = yeni  QuickSort ();
        qs . hızlı Sıralama ( dizi , 0 , n - 1 );

        sistem . dışarı _ println ( "sıralanmış dizi" );
        sistem . dışarı _ println ( Diziler . toString ( arr ));
    }
}*/
