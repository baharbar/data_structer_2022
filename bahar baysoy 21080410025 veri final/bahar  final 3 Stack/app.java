public class app {
    public static void main(String[] args) {
        Stackİmpl<Integer> stack=new Stackİmpl<>(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();//son giren ilk cıkar kuralı
       
        while(!stack.isEmpty()){//stack boş değilse 
            int val=stack.pop();
            System.out.println(val);
        }
        stack.pop();

        
    }
    
    
}
