public class TreeAgac {
    public static void main(String[] args) {
        DengeliAgac agac = new DengeliAgac();
        System.out.println("Dengeli Ağaç \n");

        agac.insert(9);
        agac.insert(4);
        agac.insert(19);
        agac.insert(81);
        agac.insert(14);
        agac.insert(89);
        agac.insert(99);

        System.out.println("\nPre-order  :");
        agac.preorder();
        System.out.println("\nIn-order   :");
        agac.inorder();
        System.out.println("\nPost-order :");
        agac.postorder();
       
    }
}