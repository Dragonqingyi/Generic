import java.util.ArrayList;
import java.util.List;

/**
 * Created by 时光与你 on 2017/5/14.
 */
class StrList{
    private List strList = new ArrayList();
    public boolean add(String ele){  //定义add方法，只能添加String类型的元素
        return  strList.add(ele);
    }

    public String get(int index) {      //返回元素
        return (String)strList.get(index);
    }
    public int size(){      //返回list长度
        return strList.size();
    }
}
public class CheckType {
    public static void main(String[] args) {
        StrList strList = new StrList();
        strList.add("AAA");
        strList.add("BBB");
        strList.add("CCC");
        //strList.add(5);       //添加Integer类型将出现编译错误
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

    }
}
