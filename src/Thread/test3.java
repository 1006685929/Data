package Thread;

/**
 * Created by hxk
 * 2018/10/26 21:35
 */

//Runnable接口实现
public class test3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String st = "hello";
                char[] c = st.toCharArray();
                try {
                    for (int i=0;i<c.length;i++){
                        System.out.println(c[i]);
                        Thread.sleep(1000);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
