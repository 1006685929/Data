package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by hxk
 * 2018/10/26 21:42
 */

//Callable实现多线程
public class test4 implements Callable<String> {
    @Override
    public String call() {
        String st = "hello";
        char[] c = st.toCharArray();
        try {
            for (int i=0;i<c.length;i++){
                System.out.print(c[i]);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return st;
    }
    public static void main(String[] args) {
        test4 rt = new test4();
        // 使用FutureTask来包装Callable对象
        FutureTask<String> task = new FutureTask<>(rt);
        new Thread(task).start();
    }
}
