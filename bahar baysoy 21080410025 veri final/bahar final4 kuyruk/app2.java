public class app2{
    public static void main(String[] args) {
        QueueArray<Integer> q=new QueueArray<>(4);//boyut=4
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());//ilk giren ilk cıkar
        
        q.printer();

    }
}