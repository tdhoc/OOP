package makearithmeticexception;

/**
 * Lớp cho ví dụ về ngoại lệ ArithmeticException
 *
 * @author 16021008
 */
public class MakeArithmeticException {

    /**
     * hàm gây ngoại lệ chia cho 0
     *
     * @throws ArithmeticException
     */
    public static void divideByZero() throws ArithmeticException {
        int divide = 5 / 0;
    }

    //Thực thi chương trình
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
