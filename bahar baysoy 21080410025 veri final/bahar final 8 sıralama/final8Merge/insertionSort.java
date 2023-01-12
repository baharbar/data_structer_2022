import java.util.Arrays;

public class insertionSort {

    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int number = arr[i];

            int j = i-1;
            while(j >= 0 && arr[j] > number){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = number;
        }
    }

    public static void main(String args[]) {
        insertionSort insertionSort = new insertionSort();
        int numbers[] = {11, 16, 8, 7, 20, 4, 14};

        System.out.println("*** Insertion Sort ***");
        insertionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
/* java'yı içe aktar kullanışlı _ diziler ;

genel  sınıf  InsertionSort {

    geçersiz  sıralama ( int  dizi []) {
        int  n = dizi . uzunluk ;

        için ( int  ben = 1 ; ben < n ; ben ++) {
            int  sayı = dizi [ ben ];

            int  j = ben - 1 ;
            while ( j >= 0 && dizi [ j ] > sayı ){
                dizi [ j + 1 ] = dizi [ j ];
                j = j - 1 ;
            }

            dizi [ j + 1 ] = sayı ;
        }
    }

    genel  statik  geçersiz  ana ( String  args []) {
        InsertionSort  insertionSort = yeni  InsertionSort ();
        int  sayılar [] = { 11 , 16 , 8 , 7 , 20 , 4 , 14 };

        sistem . dışarı _ println ( "*** Ekleme Sıralama ***" );
        eklemeSıralama . sıralama ( sayılar );
        sistem . dışarı _ println ( Diziler . toString ( sayılar ));
    }

} */