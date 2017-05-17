/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
public class foo<T> {
    /*
    静态方法不能使用类型参数，静态成员也不能使用类型参数
     */
    //static T sa;            //错误
    //static foo<T>sb = new foo<T>();         //错误
    static foo<Integer>si = new foo<>(100);
    static foo<String>ss = new foo<>("Good");

    T ob;

    foo(T ob) {
        this.ob = ob;
    }
    foo(){
        this.ob = null;
    }
}
