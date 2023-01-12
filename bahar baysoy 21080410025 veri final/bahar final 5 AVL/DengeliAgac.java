class DengeliAgac {
    private AVLNode root;

    public DengeliAgac() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void clear()
    {
        root = null;
    }

    public void insert(int data)//
    {
        root = add(data, root);
    }

    private int height(AVLNode t) {
        return t == null ? -1 : t.height;
    }

    private int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;// sol ve sağ ağaç yüksekliği ele alınır
    }

    private AVLNode add(int x, AVLNode t) {
        if (t == null)
            t = new AVLNode(x); // yeni bir node oluştur
        else if (x < t.data) {
            t.left = add(x, t.left);// t.left yeni olan ağacın kökü olur.
            if (height(t.left) - height(t.right) == 2)// sol alt ağacın yüksekliği sağ alt ağacın yüksekliği farkı 2 ise
                                                      // LL dengesizliği oluşur.
                if (x < t.left.data)//
                    t = RorateChild_RR(t);
                else
                    t = doubleWithLeftChild(t);
        } else if (x > t.data) {
            t.right = add(x, t.right);
            if (height(t.right) - height(t.left) == 2)
                if (x > t.right.data)
                    t = RorateChild_RR(t);
                else
                    t = doubleWithRightChild(t);
        } else
            ;
        t.height = max(height(t.left), height(t.right)) + 1;
        return t;
    }

    private AVLNode RorateChild_RR(AVLNode k1) {
        AVLNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max(height(k1.left), height(k1.right)) + 1;
        k2.height = max(height(k2.right), k1.height) + 1;
        return k2;
    }

    private AVLNode doubleWithLeftChild(AVLNode k3) {
        k3.left = RorateChild_RR(k3.left);// sol sağacı sağa dönder
        return RorateChild_RR(k3);// oluşan ağacı sola dönder
    }

    private AVLNode doubleWithRightChild(AVLNode k1) {
        k1.right = RorateChild_RR(k1.right);
        return RorateChild_RR(k1);
    }

    public int countNodes()// ağaçtaki eleman sayısını verir
    {
        return NodeSayisi(root);
    }

    private int NodeSayisi(AVLNode r) {// ağaçtaki eleman sayısını bulur hesaplar
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += NodeSayisi(r.left);
            l += NodeSayisi(r.right);
            return l;
        }
    }

    public boolean search(int val)// eleman varmı
    {
        return ara(root, val);
    }

    private boolean ara(AVLNode r, int val) {// elamanı bulur
        boolean found = false;// bulunmadı
        while ((r != null) && !found)// eleman bulunna kadar devam eder//köktrekitüm elemanlar dolaşılına kadar
        {
            int rval = r.data;
            if (val < rval)// gelen veri kökün verisiniden küçükse
                r = r.left;// yeni ağacımız sol ağaç
            else if (val > rval)// gelen veri kökün verisiniden büyükse
                r = r.right;// yeni ağacımız sağa ağaç
            else {
                found = true;
                break;// bulunduya true değeri gönderilir
            }
            found = ara(r, val);
        }
        return found;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(AVLNode r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " --> ");
            inorder(r.right);
        }
    }

    public void preorder() {

        preorder(root);
    }

    private void preorder(AVLNode r) {
        if (r != null) {
            System.out.print(r.data + " --> ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(AVLNode r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " --> ");
        }
    }
}
    


