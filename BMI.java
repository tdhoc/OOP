package bmi;
/**
 * @author admin
 */
public class BMI {
    /**
     * @param args the command line arguments
     * height la chieu cao
     * weight la can nang
     */
    private double height, weight;
    public BMI(double weight, double height){
        this.height = height;
        this.weight = weight;
    }
    public void setWeight(double weight)        {this.weight = weight;}
    public void setHeight(double height)        {this.height = height;}
    public double getWeight()                   {return weight;}
    public double getHeight()                   {return height;}
    
    public String ChiSoBMI(){
        double BMI = weight/(height*height);
        if (BMI <= 18.5) return "Thieu can";                        
        if (BMI <= 23.0) return  "Binh thuong";    
        if (BMI <= 24.99 ) return "Thua can" ;    
        return "Beo phi";           
    }
    public static void main(String[] args) {
        BMI cssk = new BMI(56,1.62);        //doi tuong moi cssk co can nag = 56kg , chieu cao 1.62m
        System.out.println(cssk.ChiSoBMI()); //in ket qua chi so BMI cua doi tuong cssk
    }
}
