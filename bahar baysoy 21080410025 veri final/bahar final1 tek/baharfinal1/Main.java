
    import java.util.Scanner;
    public  class Main{
        public static void main(String[] args){
          Scanner scanner =new Scanner(System.in);
          BagliListe liste=new BagliListe();
          int secim=-1;
          while(secim!=0){
            System.out.println("1--basa ekle");
            System.out.println("2--sona ekle");
            System.out.println("3--araya ekle");
            System.out.println("4--bastan sil");
            System.out.println("5--sondan sil");
            System.out.println("6--aradan sil");
            System.out.println("0--çikiş");
            System.out.println("seçiminiz:");
           
            secim=scanner.nextInt();
            scanner.nextLine();
            
           
            switch(secim){
                case 1:liste.basaekle(); break;
                case 2:liste.sonaekle(); break;
                case 3:liste.arayaekleme(); break;
                case 4:liste.bastansil(); break;
                case 5:liste.sondansil(); break;
                case 6:liste.aradansil(); break;
                case 0: System.out.println("çikiş yaptiniz"); break;
                default: System.out.println("hatali seçim yaptiniz");
    
            }
            liste.yazdir();
          }
        }
        
    }