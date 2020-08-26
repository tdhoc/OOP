package shapedemo;
/**
 * @author 16021008
 */
class Shape{
    private String color = "red";     
    private boolean filled = true;
    Shape(){}
    Shape(String cl, boolean f){
        color = cl;
        filled = f;
    }
    public String getColor()                    {return color;}
    public void setColor(String color)          {}
    public boolean isFilled()                   {return true;};
    public void setFilled(boolean filled)       {}
}

public class ShapeDemo {
    public static void main(String[] args) {
    //Hình tròn
        Circle t = new Circle();
        System.out.println(t.toString());
    //Hình chữ nhật
        Rectangle hcn = new Rectangle();
        System.out.println(hcn.toString());
    //Hình vuông
        Square v = new Square();
        v.setSide(3.0);
        System.out.println(v.toString());
        System.out.println("Cạnh hình vuông là : "+v.getSide()+" m.");
    /*/test2_Hình chữ nhật
        Rectangle hcn1 = new Rectangle();
        hcn1.setLength(4.0);
        hcn1.setWidth(3.0);
        System.out.println(hcn1.toString());*/
    }  
}
