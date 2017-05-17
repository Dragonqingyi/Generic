/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
class Info2<T extends Number>{      //指定上限，只能是数字类型
    private T var;                  //此类型由外部决定

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {         //覆写toString方法，方便打印对象
        return this.var.toString();
    }
}
public class genericDemoTwo {
    public static void main(String[] args) {
        Info2<Integer>info = fun(30);
        System.out.println(info.getVar());
    }
    //泛型方法
    public static <T extends Number>Info2<T>fun(T temp){
        Info2<T>info = new Info2<T>();     //根据传入数据类型实例化Info
        info.setVar(temp);              //将传递的内容设置到Info对象的var属性之中
        return info;                    //返回实例化对象
    }
}
