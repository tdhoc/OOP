package shapedemo;
/**
 * @author 16021008
 * lớp Circle kế thừa từ lớp cha là Shape
 */
public class Circle extends Shape {
    private double radius = 1.0;    // bán kính_đơn vị mét
    private final double PI = 3.14; // hằng số PI
    Circle(){}
    Circle(double ra){this.radius = ra;}
    Circle(double ra,String cl,boolean f){
        super(cl,f);     // gọi tạo tử từ lớp cha_Shape
        radius = ra;     
    }
    public void setRadius(double ra)        {this.radius = ra;}
    public double getRadius()               {return radius;};
    public double getArea()                 {return PI*radius*radius;} //diện tích hình tròn
    public double getPerimeter()            {return 2*PI*radius;}      //chu vi hình tròn
    //toString cho ra thông tin của hình
    public String toString()                {return "\nHình tròn"+"\nchu vi: "+getPerimeter()+" m"+"\ndiện tích: "+getArea()+" m2.";}
}
