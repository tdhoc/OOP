package graphicapp;

/**
 * lớp Circle kế thừa từ lớp cha là Shape
 *
 * @author 16021008
 */
public class Circle extends Shape {

    // bán kính hìn tròn_đơn vị mét
    public double radius;

    // hằng số PI
    private final double PI = 3.14;

    /**
     * Constructor khởi tạo mặc định
     */
    Circle() {
    }

    /**
     * Constructor khởi tạo
     *
     * @param radius bán kính hình tròn
     */
    Circle(double ra) {
        this.radius = ra;
    }

    /**
     * Constructor khởi tạo
     *
     * @param DiaName tên của Diagrram
     * @param LayName tên của Laye
     * @param radius bán kính hình tròn
     * @param location tọa độ hình tròn
     * @param color hình có được tô màu hay không?
     * @param move hình có được di chuyển hay không?
     */
    Circle(String DiaName, String LayName, Location location, boolean color, boolean move, double ra) {
        super(DiaName, LayName, location, color, move);
        radius = ra;
    }

    /**
     * cài đặt bán kính htron
     *
     * @param ra
     */
    public void setRadius(double ra) {
        this.radius = ra;
    }

    /**
     * Lấy bán kính htron
     *
     * @return bán kính htron
     */
    public double getRadius() {
        return radius;
    }

    ;

    /**
     * Lấy diện tích hình tròn
     * 
     * @return diện tích hình tròn
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Lấy chu vi hình tròn
     *
     * @return chu vi hình tròn
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * Lấy thông tin mô tả hình tròn
     *
     * @return thông tin mô tả hình tròn
     */
    @Override
    public String toString() {
        return "\nCircle[" + "Perimeter: " + getPerimeter() + " m;" + " Area: " + getArea() + " m2]";
    }

    /**
     * Lấy các mô tả thuộc tính đầy đủ
     *
     * @return thuộc tính của cả lớp cha và chính nó
     */
    @Override
    public String ExString() {
        return super.ExString() + "\nCircle[" + "Radius: " + radius + " m, Perimeter: " + getPerimeter() + " m;" + " Area: " + getArea() + " m2]\n";
    }

    /**
     * In ra thông tin hình tròn
     */
    @Override
    public void attribute() {
        super.attribute();
    }

}
