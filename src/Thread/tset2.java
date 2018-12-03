package Thread;

/**
 * Created by hxk
 * 2018/10/26 21:29
 */

//匿名内部类实现
public class tset2 {
    public static void main(String[] args) {
        tset2.MyThread t = new tset2().new MyThread();
        t.start();
    }
    class MyThread extends Thread{
        @Override
        public void run() {
            String str = "hello";
            char[] chars = str.toCharArray();
            try {
                for (int i=0;i<str.length();i++){
                    System.out.print(chars[i]);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
