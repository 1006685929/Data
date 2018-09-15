package NiuKe;

public class HasStatic {
    private static int x = 100;
    public static void main(String args[ ]){
        HasStatic hs1 = new HasStatic();
        hs1.x++;//101
        HasStatic hs2 = new HasStatic();
        hs2.x++;//102
        hs1=new HasStatic();
        hs1.x++;//103
        HasStatic.x--;//102
        System.out.println( "x=" +x);
    }
}
