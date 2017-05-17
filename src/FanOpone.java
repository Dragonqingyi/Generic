import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
public class FanOpone {
    /*
    static void fromArrayToCollection(Object[]a, Collection<?>c){
        for (Object o:a){
            //编译器错误
             c.add(o);
        }
    }
    */
    //数组中所有Object放入集合中
    static <T> void fromArrayToCollection(T[]a,Collection<T>c){
        for (T o:a){
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[]oa = new Object[100];
        Collection<Object>co = new ArrayList<Object>();
        //下面T代表Object类型
        fromArrayToCollection(oa,co);
        String[]sa = new String[100];
        Collection<String>cs = new ArrayList<>();
        //下面T代表String类型
        fromArrayToCollection(sa,cs);
        //下面T代表Object类型
        fromArrayToCollection(sa,cs);
        Integer[]ia = new Integer[100];
        Float[]fa = new Float[100];
        Number[]na = new Number[100];
        Collection<Number> cn = new ArrayList<>();
        //下面T代表Number类型
        fromArrayToCollection(ia,cn);
        fromArrayToCollection(fa,cn);
        fromArrayToCollection(na,cn);
        //下面T代表String类型
        fromArrayToCollection(na,co);
        //编译错误，Number不是String子类
        //fromArrayToCollection(na,cs);
    }
}
