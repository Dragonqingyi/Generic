import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 时光与你 on 2017/5/14.
 */
public class FanList {
    public static void main(String[] args) {
        List<String>strList = new ArrayList<String>();
        strList.add("AAA");
        strList.add("BBB");
        strList.add("CCC");
        for (String i:strList
             ) {
            System.out.println(i);
        }
    }
}
