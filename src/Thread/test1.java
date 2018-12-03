package Thread;

/**
 * Created by hxk
 * 2018/10/26 16:05
 */

//继承Thread类
public class test1 extends Thread{
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
    public static void main(String[] args) {
        test1 t = new test1();
        t.start();
    }
}
