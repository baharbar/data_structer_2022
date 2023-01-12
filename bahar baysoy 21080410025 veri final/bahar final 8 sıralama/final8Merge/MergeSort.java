import java.util.Arrays;

public class MergeSort {

    int[] mergeSortedArrays(int arr1[], int arr2[]){
        int n1=0;
        int n2=0;

        int k = 0;
        int[] result = new int[arr1.length+arr2.length];

        while(n1<arr1.length && n2<arr2.length){
            if(arr1[n1] < arr2[n2]){
                result[k] = arr1[n1];
                n1++;
            }
            else{
                result[k] = arr2[n2];
                n2++;
            }
            k++;
        }

        while(n1<arr1.length){
            result[k] = arr1[n1];
            n1++;
            k++;
        }

        while(n2<arr2.length){
            result[k] = arr2[n2];
            n2++;
            k++;
        }

        return result;
    }

    int[] mergeSort(int arr[])
    {
        if(arr.length <= 1){
            return arr;
        }

        int midPoint = arr.length / 2;

        int[] leftSorted = mergeSort(Arrays.copyOfRange(arr, 0, midPoint));
        int[] rightSorted = mergeSort(Arrays.copyOfRange(arr, midPoint, arr.length));

        return mergeSortedArrays(leftSorted, rightSorted);
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {11,16,8,7,20,4,14};
       // int n = arr.length;

        MergeSort ms = new MergeSort();
        int[] sortedArray = ms.mergeSort(arr);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(sortedArray));
    }
}
/* sınıf  MergeSort {

    int [] birleştirmeSortedArrays ( int  dizi1 [], int  dizi2 []){
        int  n1 = 0 ;
        int  n2 = 0 ;

        int  k = 0 ;
        int [] sonuç = yeni  int [ dizi1 . uzunluk + dizi2 . uzunluk ];

        while ( n1 < dizi1 . uzunluk && n2 < dizi2 . uzunluk ){
            eğer ( dizi1 [ n1 ] < dizi2 [ n2 ]){
                sonuç [ k ] = dizi1 [ n1 ];
                n1 ++;
            }
            başka {
                sonuç [ k ] = dizi2 [ n2 ];
                n2 ++;
            }
            k ++;
        }

        while ( n1 < dizi1 . uzunluk ){
            sonuç [ k ] = dizi1 [ n1 ];
            n1 ++;
            k ++;
        }

        while ( n2 < dizi2 . uzunluk ){
            sonuç [ k ] = dizi2 [ n2 ];
            n2 ++;
            k ++;
        }

        dönüş  sonucu ;
    }

    int [] birleştirmeSıralama ( int  dizi [])
    {
        if ( dizi . uzunluk <= 1 ){
            dönüş  dizisi ;
        }

        int  ortaNokta = dizi . uzunluk / 2 ;

        int [] leftSorted = birleştirmeSort ( Diziler . kopyaOfRange ( dizi , 0 , ortaNokta ));
        int [] rightSorted = birleştirmeSort ( Diziler . kopyaOfRange ( dizi , orta Nokta , dizi . uzunluk ));

         birleştirmeSortedArrays'i döndürür ( solSorted , rightSorted );
    }

    // Sürücü yöntemi
    genel  statik  geçersiz  ana ( String  args [])
    {
        int  dizi [] = { 11 , 16 , 8 , 7 , 20 , 4 , 14 };
        int  n = dizi . uzunluk ;

        MergeSort  ms = yeni  MergeSort ();
        int [] sortedArray = ms . birleştirmeSort ( dizi );

        sistem . dışarı _ println ( "\nSıralı dizi" );
        sistem . dışarı _ println ( Diziler . toString ( sortedArray ));
    }
} */































    

