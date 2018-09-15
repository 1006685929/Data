package Array;

public class Test {

    public static void main(String[] args) {

        Array arr = new Array();
        for (int i = 0;i<10;i++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(99);
        System.out.println(arr);
        //[99, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        //arr.remove(0);
       // System.out.println(arr);
        //[0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

}
