import java.util.Comparator;

/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] ob) {
        vals = ob;
    }

    @Override
    public T min() {
        T val = vals[0];
        for (int i = 0; i < vals.length; ++i) {
            if (vals[i].compareTo(val) < 0) {
                val = vals[i];
            }
        }
        return val;
    }

    @Override
    public T max() {
        T val = vals[0];
        for (int i = 0; i < vals.length; ++i) {
            if (vals[i].compareTo(val) > 0){
                val = vals[i];
            }
        }
        return val;
    }
}
