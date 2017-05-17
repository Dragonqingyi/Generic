/**
 * Created by 时光与你 on 2017/5/15.
 */
public class A1 extends fru<String> {
    //标准继承泛型类
    @Override
    public String getInfo() {
        return super.getInfo();
    }
    /*  必须是String返回类型，不然error
    public Object getInfo(){
       return super.getInfo();
    }
    */

    public A1(String info) {
        super(info);
    }
}
