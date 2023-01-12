import java.time.temporal.Temporal;

public class BagliListe {
    //çift yönlü doğrusal bağlı liste yapısı
    Node head=null;
    Node tail=null;
    
    void basaekle(int data){

    Node eleman=new Node(data);
    if(head==null){
        head=eleman;
        tail=eleman;
    
     } else{
        eleman.next=head;
        head.prev=eleman;
        head=eleman;

     }


    }

    void sonaekle(int data){

        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
        
         } 
         else
         {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
           
         }
    
    
        }


        void arayaekle(int indis, int data){

            Node eleman=new Node(data);
            if(head==null){
                head=eleman;
                tail=eleman;
            
             } 
             else if(head !=null && indis==0)
             {
                eleman.next=head;
                head.prev=eleman;
                head=eleman;
             }
        else{
            int n=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                n++;
            }
            temp=head;
            if(indis>n){
                tail.next=eleman;
                eleman.prev=tail;
                tail=eleman;
            }else{
                int i=0;
                while(i!= indis){
                    temp=temp.next;
                    i++;


                }
                eleman.prev=temp.prev;
                temp.prev.next=eleman;
                
                eleman.next=temp;
                temp.prev=eleman;
            }
        }
        
            }

            void bastansil( ){

                if(head!=null){
                    if(head.next==null){
                    head=null;
                    tail=null;
                    }
                 
                 else
                 {
                    head=head.next;
                    head.prev=null;
                 }
            
                }

                }
            
                void sondansil( ){

                    if(head!=null){
                        if(head.next==null){
                        head=null;
                        tail=null;
                        
                     } 
                     else
                     {
                        tail=tail.prev;
                        tail.next=null;
                     }
                
                    }
                    }

                    void aradansil(int indis)
                    {

                        if(head!=null){
                            if(head.next==null && indis<=0){
                                head=null;
                                tail=null;
                                
                             
                         } 
                              else if(head.next!=null && indis==0)
                         {
                           head=head.next;
                            head.prev=null;
                           
                         }
                    else{
                        int n=0;
                        Node temp=head;
                        while(temp!=null){
                            n++;
                            temp=temp.next;
                            
                        }
                        
                        if(indis>=(n-1)){
                           
                        tail=tail.prev;
                        tail.next=null;
                        }else{
                            temp=head;
                    
                            int i=0;
                            while(i< indis){
                                i++;
                                temp=temp.next;
                               
            
            
                            }
                           temp.next.prev=temp.prev;
                           temp.prev.next=temp.next;
                        }
                    }
                }
            }
                    
                


        void yazdir(){

            Node temp=head;
            System.out.print(" bas [");
            while(temp!=null){
                System.out.print(temp.data +"-");
               temp=temp.next;
            }
            System.out.print(" ]son");
              
             }
             void sondanyazdir(){

                Node temp=tail;
                System.out.print(" son -");
                while(temp!=null){
                    System.out.print(temp.data +"-");
                   temp=temp.prev;
                }
                System.out.print(" baş");
                  
                 }

            
        
        
            }
    /*import java.util.Scanner;

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
    
         while(temp !=tail){
            System.out.println(temp.data +"-->");
               temp =temp.next;
         }
         System.out.println(temp.data +"->son");
        }

    }
 }
    


}*/
