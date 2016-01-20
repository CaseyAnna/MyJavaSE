// StringBuffer的默认容量(capacity)为16
//当设置StringBuffer的容量
//1、小于当前容量时，容量不变。
//      本例中，容量依然为16。
//2、大于当前容量，并且小于(当前容量+1)*2，则容量变为(当前容量+1)*2。
//      本例中，16<20<(16+1)*2=34，所以容量为34。
//3、大于当前容量，并且大于(当前容量+1)*2，则容量变为用户所设置的容量。
//      本例中，80>16，80>(16+1)*2=34，所以容量为80。

//StringBuffer内部数组的长度和字符串长度是不相同的，默认长度为16，你第一个append操作‘大家好’的字符长度未超出16，所以直接添加，而第二个操作的字符长度超过了16则调用扩展方法，将大小扩充到原来的两倍，操作为：(16+1)*2=34
public class Demo1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity()); //Ĭ��16
        StringBuffer s2 = new StringBuffer(50);
        System.out.println(s2.capacity()); //50
        StringBuffer s3 = new StringBuffer("hello");
        System.out.println(s3.capacity()); //21

        StringBuffer s4 = new StringBuffer();
        System.out.println(s4.capacity());

        StringBuffer s5 = new StringBuffer();
        s5.ensureCapacity(17);
        System.out.println(s5.capacity());

        StringBuffer str = new StringBuffer();
        str.append("大家好");
        System.out.println("str:" + str);
        System.out.println("length:" + str.length());
        System.out.println("capacity:" + str.capacity());
        str.append("大家好我们大家都很喜欢学习java语言");
        System.out.println("str:" + str);
        System.out.println("length:" + str.length());
        System.out.println("capacity:" + str.capacity());
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("str:" + sb);
        System.out.println("length:" + sb.length());
        System.out.println("capacity:" + sb.capacity());
    }
}
