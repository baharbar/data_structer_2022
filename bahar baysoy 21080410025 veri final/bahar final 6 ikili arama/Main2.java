public class Main2 {
    /**
     * @param args
     */
    public static void  main(String[] args) {
        Btree bt=new Btree();
        //ağacın içine düğüm eklencek
        bt.root=bt.insert (bt.root,10);
        bt.root=bt.insert(bt.root,15);
        bt.root=bt.insert(bt.root,8);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,4);
        bt.root=bt.insert(bt.root,12);
        System.out.println("kökün datasi:"+ bt.root.data);
        System.out.println("kökün sağindaki datasi:"+ bt.root.right.data);
        System.out.println("kökün solundaki  datasi:"+ bt.root.left.data);
        System.out.println("kökün solunun solundaki datasi:"+ bt.root.left.left.data);
        System.out.println("kökün saginin sagindeki datasi:"+ bt.root.right.right.data);
        System.out.println("kökün saginin  solundaki datasi:"+ bt.root.right.left.data);
        //System.out.println("kökün datasi:"+bt.root.data);
        //System.out.println("kökün datasi:"+bt.root.data);

          System.out.println("\nkök degeri:"+ bt.root.data);
          bt.root=bt.delete(bt.root,10);
          System.out.println("yeni kök degeri:"+ bt.root.data);

         



        

    }
}

