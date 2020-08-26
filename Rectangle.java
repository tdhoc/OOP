package shapedemo;
/**
 * @author 16021008
 * Rectangle kế thừa từ lớp cha là Shape
 */
public class Rectangle extends Shape {
    private double width = 1.0;  //chiều rộng HCN
    private double length = 1.0;  // chiều dài HCN
    Rectangle(){}   
    Rectangle(double w, double len){this.width = w;
                                    this.length = len;}
    Rectangle(double w, double len,String cl, boolean f){
        super(cl,f);   //gọi tạo tử từ lớp cha_Shape
        width = w;
        length = len;
    }
    public void setWidth(double w)      {this.width = w;}   // chiều rộng HCN
    public double getWidth()            {return width;}
    public void setLength(double len)   {this.length = len;} // chiều dài HCN
    public double getLength()           {return length;}
    public double getArea()             {return width*length;}  //diện tích HCN
    public double getPerimeter()        {return 2*(width+length);} // chu vi HCN
    //toString cho ra thông tin của hình
    public String toString()                {return "\nHình chữ nhật"+"\nchu vi: "+getPerimeter()+" m"+"\ndiện tích: "+getArea()+" m2.";}
}
