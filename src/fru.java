/**
 * Created by 时光与你 on 2017/5/14.
 */
public class fru<T> {
    //基本泛型使用
    private T info;

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public fru(T info) {//此方法用于下面输入的内容

        this.info = info;
    }

    public static void main(String[] args) {
        //因为传给T形参的是String实际类型，所以构造器的参数只能是String类型
        fru<String> a1 = new fru<>("水果");
        System.out.println(a1.getInfo());
        //因为传给T形参的是Double实际类型，所以构造器的参数只能是Double类型
        fru<Double>a2 = new fru<>(5.9);
        System.out.println(a2.getInfo());
    }
}
