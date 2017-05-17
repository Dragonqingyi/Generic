/**
 * Created by 时光与你 on 2017/5/15.
 */
public class A2 extends fru {
    public A2(Object info) {
        super(info);
    }

    @Override
    public String getInfo() {
        //super.getInfo()方法返回的是Object类型，必须要toString
        return super.getInfo().toString();
    }
}
