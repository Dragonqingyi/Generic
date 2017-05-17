import java.util.ArrayList;

/**
 * Created by 时光与你 on 2017/5/14.
 */
public class youErr {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("AAA");
        a.add("BBB");
        a.add("CCC");
        a.add(4);
        for (int i = 0; i < a.size(); i++) {
            //因为集合里的对象都是Object类型，所有必须进行强制转换
            //最后一个元素出现ClassCastException异常
            String str = (String)a.get(i);
        }
        /*for (Object i:a) {
            System.out.println(i);
        }
        */
    }
}
