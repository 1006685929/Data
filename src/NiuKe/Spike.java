package NiuKe;

public class Spike {
    public static void main(String[] args)
    {
        Counter a = new Counter();
        System.out.println(a.increment());//0
        System.out.println(a.anotherIncrement());
        Counter b = new Counter();
        System.out.println(b.increment());
    }
}
class Counter
{
    private static int count = 0;
    public int increment()
    {
        return count++;
    }
    public int anotherIncrement()
    {
        return ++count;
    }
}
