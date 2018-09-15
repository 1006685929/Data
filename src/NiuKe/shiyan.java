package NiuKe;

//值传递
public class shiyan {
    //先创建一个更改变量的函数,并加上了打印的函数用于比较
    public void change(int c){
        c=c*5;
        System.out.println(c);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int p=5;    //先声明一个变量p=5
        shiyan c=new shiyan(); //创建对象c
        //利用c的成员函数改变p值,使p=p*5
        c.change(p);
        //输出的是理想值25
        System.out.print(p);
        //奇怪输出的是5

    }
}
