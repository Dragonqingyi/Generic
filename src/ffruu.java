/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
//设置类型形参上限,及多个上限，用&连接
public class ffruu<T extends Number&java.io.Serializable> {
    T col;
    public static void main(String[] args) {
        ffruu<Integer>ai = new ffruu<>();
        ffruu<Double>ad = new ffruu<>();
        //下面代码产生编译异常
        //因为String不是Number子类型
        //ffruu<String>as = new ffruu<String>();
    }
}
