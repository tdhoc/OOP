/**
 * Thực thi chương trình 
 *
 * @author 16021008
 */
public class ExpressionTest{

    public static void main(String[] args) throws Exception {
        Expression s0 = new Numeral(0);
        Expression s1 = new Numeral(1);
        Expression s2 = new Numeral(2);
        Expression s3 = new Numeral(3);
        Expression s10 = new Numeral(10);

        Expression s100 = new Square(s10);
        Expression s99 = new Subtraction(s100, s1);
        Expression s6 = new Multiplication(s2, s3);
        Expression s105 = new Addition(s99, s6);
        Expression s11025 = new Square(s105);
        Expression divide = new Division(s1,s0);
        
        try {
            System.out.println(divide.evaluate());
        } catch (ArithmeticException error) {
            System.out.println(error);
            System.err.println("Lỗi chia cho 0");
        }
    }
}
