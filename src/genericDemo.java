/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
class Info<T>{                      //设置泛型
    public T var;                   //定义泛型变量

    @Override
    public String toString() {      //覆写toString方法，方便打印对象
        return this.var.toString();
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
public class genericDemo {
    public static void main(String[] args) {
        Info<String>i1 = new Info<>();      //声明String泛型对象
        Info<Object>i2 = new Info<>();      //声明Object泛型对象
        i1.setVar("MLDN");
        i2.setVar(new Object());
        fun(i1);
        fun(i2);
    }

    private static void fun(Info<? super String>temp) {//只能接受String或Object类型的泛型
        System.out.println(temp);
    }
}
