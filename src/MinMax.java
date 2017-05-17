import java.util.Comparator;

/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
interface MinMax<T extends Comparable> {
    T min();
    T max();
}
