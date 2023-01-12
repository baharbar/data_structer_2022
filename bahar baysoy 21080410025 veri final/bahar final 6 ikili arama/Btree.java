public class Btree {
    Node root;//root tanımlandı
    public Btree(){  //NESNE OLUŞTURULUR
        root=null;}
      Node newNode(int data) {  //newnode fonksiyonu oluşturulur
        root=new Node(data);
        System.out.println(data + " agaca eklendi");
        return root;
        }
        Node insert(Node root, int data){
            if(root!=null){
                if (data<root.data)
                    root.left=insert(root.left,data);
                    else
                        root.right=insert(root.right,data);

                    }
                else
                    root=newNode(data);
                    return root;
                
            }
        //eleman silme 
            Node delete(Node root,int x){
                Node t1,t2;
                if(root==null)
                return null;
                if(root.data==x){
                    if(root.left==root.right){//silinecek düğümün altında dal yoktur
                        root=null;
                        return null;
                    }
                    else if(root.left==null){
                        t1=root.right;
                        return t1;
                        
                    }
                    else if(root.right==null){
                        t1=root.left;
                        return t1;

                    }
                    else{
                    t1=t2=root.right;
                    while(t1.left==null){
                        t1=t1.left;

                    }
                    t1.left=root.left;
                    return t2;
                }
            }
                else {
                    if(x<root.data){
                        root.left=delete(root.left,x);
                    }
                    else 
                    root.right=delete(root.right,x);

                }
                    return root;
                }

            
          }
             

        
        