import java.util.ArrayList;
import java.util.List;

/**
 * Created by 拾光浅唱 on 2017/5/16.
 */
public class Canvas {
    //同时在画布上绘制多个图形
    //使用通配符接受所有Shape的子类，包括其本身
    public void drawAll(List<? extends Shape>shapes){
        for (Shape s:shapes){
            s.draw(this);
        }
    }

    public static void main(String[] args) {
        List<Shape>circleList = new ArrayList<Shape>();
        circleList.add(new Circle());
        circleList.add(new Rectangle());
        Canvas c = new Canvas();
        c.drawAll(circleList);
    }
}
