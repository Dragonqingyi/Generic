/**
 * Created by 拾光浅唱 on 2017/5/17.
 */
class Apple<T extends Number> {
    T size;

    public Apple(T size) {
        this.size = size;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }

}
public class cachu {
    public static void main(String[] args) {
        Apple<Integer> a = new Apple<Integer>(6);
        //a的getSize方法返回Integer对象
        Integer as = a.getSize();
        //把a的对象赋给Apple变量，会丢失尖括号里的类型信息,因为b不带泛型信息
        Apple b = a;
        //b只知道size的类型是number
        Number size1 = b.getSize();
        //下面代码引起编译错误
        //Integer size2 = b.getSize();
    }
}
