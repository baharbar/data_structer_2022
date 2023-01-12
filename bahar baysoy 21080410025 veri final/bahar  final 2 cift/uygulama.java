import java.util.Scanner;

public class uygulama {
    public static void main(String[] args){
        Scanner Scanner =new Scanner(System.in);
        BagliListe bl=new BagliListe();
        int secim=-1,sayi,indis;
        while(secim!=0){
          System.out.println(" \n1-basa ekle");
          System.out.println("2-sona ekle");
          System.out.println("3-araya ekle");
          System.out.println("4--bastan sil");
          System.out.println("5--sondan sil");
          System.out.println("6--aradan sil");
          System.out.println("7-sondan başa yazdir ");
         
          System.out.println("0--çikiş");
          System.out.println("seçiminiz:");
          secim=Scanner.nextInt();
          //Scanner.nextLine();
          if(secim==1){
              
            System.out.println("sayi:");
            sayi=Scanner.nextInt();
            bl.basaekle(sayi);
          }
          else if(secim == 2) {
            System.out.println("sayi:");
            sayi=Scanner.nextInt();
            bl.sonaekle(sayi);
          }
          else if(secim == 3) {
            System.out.println("indis:");
            indis=Scanner.nextInt();

            System.out.println("sayi:");
            sayi=Scanner.nextInt();
            bl.arayaekle(indis,sayi);
          }
          else if(secim==4)
          bl.bastansil();

          else if(secim==5)
          bl.sondansil();
          else if(secim == 6) {
            System.out.println("indis:");
            indis=Scanner.nextInt();
            bl.aradansil(indis);
        }


          else if( secim ==7){
            bl.sondanyazdir();
            System.out.println();
          
         
        }
        bl.yazdir();
        }
      }
    
}
