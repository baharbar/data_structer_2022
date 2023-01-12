
public class Stackİmpl<T>{
    private int maxSize;
    private Object[] stackArry;
    private int top;
    Stackİmpl(int size){
        this.maxSize=size;
        stackArry=new Object[this.maxSize];
        this.top=-1;
    }
    public void push (Object newItem){
        if(isFull()){
            System.out.println("the stack is full...");
            return;
        
        }
        top=top+1;
        stackArry[top]=newItem;
    }
    public boolean isFull(){
        return(top==maxSize-1);
    }
    /**
     * @return
     */
    public T pop(){
        if(isEmpty()){
            System.out.println("stack bos...");
            return null;
        }
        T item =(T) stackArry[top];
        top=top-1;
        return item;
    }
    public boolean isEmpty(){
        return (top==-1);
    }


}
     
    