//public class BinarySearch {
    import java.util.Scanner;
class BinarySearch
{
  public static void main(String args[])
  {
    int c, first, last, middle, n, search, array[];
 
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Eleman sayısını girin");
        n = in.nextInt();
        array = new int[n];
 
        System.out.println("Giriş:" + n + " tane tam sayı girin");
 
 
        for (c = 0; c < n; c++)
          array[c] = in.nextInt();

        System.out.println("Bulunacak değeri girin");
        search = in.nextInt();
    }
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search )
      {
        System.out.println(search + " şu konumda bulundu " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if (first > last)
      System.out.println(search + " listede yok.\n");
  }
//2}

public BinarySearch() {
}

@Override
public String toString() {
    return "BinarySearch []";
}
    
}
