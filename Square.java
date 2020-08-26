package shapedemo;
/**
 * @author 16021008
 * lớp Square kế thừa từ lớp cha là Rectangle
 */
public class Square extends Rectangle{
    Square(){}
    Square(double side){}
    Square(double side,String cl, boolean f){
        super(side,side,cl,f);
    }
    public double getSide()                 {return super.getWidth();}    // side là cạnh của hình vuông
    public void setSide(double side)        {super.setWidth(side);
                                             super.setLength(side);}
    public void setWidth(double side)       {super.setWidth(side);
                                             super.setLength(side);}
    public void setLength(double side)      {super.setLength(side);
                                             super.setWidth(side);}
    //toString cho ra thông tin của hình
    public String toString()                {return "\nHình vuông"+"\nchu vi: "+getPerimeter()+" m"+"\ndiện tích: "+getArea()+" m2.";}
}
