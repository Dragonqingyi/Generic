import java.util.ArrayList;
import java.util.List;

/**
 * Created by 拾光浅唱 on 2017/5/16.
 */
public class LsitFan {
    public static void main(String[] args) {
        List<String>l1 = new ArrayList<>();
        List<String>l2 = new ArrayList<>();
        System.out.println(l1.getClass() == l2.getClass());
    }
}
