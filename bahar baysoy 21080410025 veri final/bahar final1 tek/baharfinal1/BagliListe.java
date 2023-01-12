import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class BagliListe {
    Scanner Scanner =new Scanner(System.in);
Node head=null;
Node tail=null;


void basaekle(){
    int data;
    System.out.println("data:");
    data= Scanner.nextInt();
    Node eleman=new Node(data);
    if(head==null){
       head=eleman;
       tail=eleman;
       tail.next=head;
    }
    else{
        eleman.next=head;
        head=eleman;
        tail.next=head;

    }
}
void sonaekle (){
    int data;
    System.out.println("data:");
    data= Scanner.nextInt();
    Node eleman=new Node(data);
    if(head==null){
       head=eleman;
       tail=eleman;
       tail.next=head;
    }
    else {
        tail.next=eleman;
        tail=eleman;
        tail.next=head;

    }
    }


    void arayaekleme(){
        int data ,indis;
        System.out.println("indis:");
        indis= Scanner.nextInt();
        System.out.println("data:");
        data= Scanner.nextInt();
        Node eleman=new Node(data);
        if(head==null){
           head=eleman;
           tail=eleman;
           tail.next=head;
        }
        else if( indis ==0)
        {
            eleman.next=head;
            head=eleman;
            tail.next=head;
    
        }
        else{
            int n=0;
            Node temp=head;
            Node temp2=head;
            while(temp!=tail){
                temp=temp.next;
                n++;
            }
            n++;
            if(indis>=(n-1)){
                tail.next=eleman;
                tail=eleman;
                tail.next=head;
            }else{
                temp=head;
                temp2 =temp;
                int i=0;
                while(i<indis){
                    i++;
                    temp2=temp;
                    temp=temp.next;

                }
                temp2.next=eleman;
                eleman.next=temp;
            }
        }
    }

 void bastansil(){
    if(head==null)
        System.out.println("liste boş.");
        else if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
            tail.next=head;
        }
       
 
     }


 void sondansil(){
    if(head==null)
    System.out.println("liste boş.");
    else if(head==tail){
        head=null;
        tail=null;
    }else{
         Node temp=head;
         while(temp.next!=tail){
            temp =temp.next;
         }
         tail=temp;
         tail.next=head;

    }

 }
 void aradansil(){
    if(head==null)
    System.out.println("liste boş.");
    else if(head==tail){
        head=null;
        tail=null;
    }else{
        int indis,n=0;
        System.out.println("indis:");
        indis=Scanner.nextInt();
        Node temp=head;
        Node temp2=temp;
        
         while(temp !=tail){
            temp =temp.next;
            n++;
         }
         n++;
         temp=head;
         int i=0;
        while(i<indis){
            temp2=temp;
            temp=temp.next;
            i++;

        }
        temp2.next=temp.next;

    }
 }


 void yazdir(){
    if(head==null)
    System.out.println("liste boş.");
    else {
      Node temp=head;
      System.out.print ( temp.data +" bas [ ");
         while(temp !=tail){
            System.out.print ( temp.data +"-");
               temp =temp.next;
         }
         System.out.println( temp.data +" ] son");//son düğümün datası yazdırılır.
        }

    }
 }
    

