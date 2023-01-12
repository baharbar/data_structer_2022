public class QueueArray <T>{
    Object[] ArrayQueue;
    int rear,front,maxSize,nItems;//rear=sonrasi,front=oncesi
    public QueueArray(int size){
        this.maxSize=size;
        ArrayQueue=new Object[this.maxSize];
        front=0;
        rear=-1;
        nItems=0;

    }
    
    public void enqueue(Object o){
        if(isFull()){
            System.out.println("queue is full");
            return;


        }
        rear++;
        ArrayQueue[rear]=o;
        nItems++;

    }
    public T dequeue(){
        if(isEmpty()){
            System.out.println("kuyruk bos");
            return null;

        }
        T ObjectOut= (T) ArrayQueue[front];
        for(int i=1; i<rear+1;i++){
            T tmp;
            tmp= (T) ArrayQueue[i];
            ArrayQueue[i-1]=tmp;
        }
        ArrayQueue[rear]=null;
        nItems--;
        rear--;
        
        return ObjectOut;

    }
    private boolean isEmpty(){
        return(nItems==0);
    }


    public boolean isFull(){
        return (nItems==maxSize);

    }
    public void printer(){
        System.out.println("listing the elements in the queue...");//kuyruktaki elementleri listele
        for(int i=0;i<ArrayQueue.length;i++){
            System.out.println("element Order ["+ i+1 +"]" + ArrayQueue[i]);
        }

    }

    
}
