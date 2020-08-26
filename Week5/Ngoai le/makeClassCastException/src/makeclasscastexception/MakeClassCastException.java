package makeclasscastexception;

/**
 * Lớp cho ví dụ về ngoại lệ ClassCastException
 * 
 * @author 16021008
 */
public class MakeClassCastException {

    /**
     * Hàm có lỗi ClassCast
     *
     * @throws ClassCastException
     */
    public static void example() throws ClassCastException {
        Object a = new Object();
        Integer i = (Integer) a;
    }

    // thực thi chương trình
    public static void main(String[] args) {
        try {
            example();
        } catch (ClassCastException cce) {
            System.out.println(cce.getMessage());
        }
    }
}
