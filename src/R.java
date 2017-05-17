import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by 拾光浅唱 on 2017/5/16.
 */
public class R<T> {
    //下面代码错误，不能在静态属性声明中使用类型参数
    //static T info;
    T age;
    public void foo(T msg){

    }
    //下面方法错误，不能再静态方法声明中使用类型形参
    /*
    public static void bar(T msg){
    }
    */
    public static void main(String[] args) {
        /*  由于系统中并不真正生成泛型类，故经instanceof处理后不能使用泛型类，下面代码错误
        Collection cs = new ArrayList<String>();
        if (cs instanceof List<String>){

        }
        */
    }
}
