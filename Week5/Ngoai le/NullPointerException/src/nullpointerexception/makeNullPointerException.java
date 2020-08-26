package nullpointerexception;

/**
 * Lớp cho ví dụ về ngoại lệ NullPointerException
 * 
 * @author 16021008
 */
public class makeNullPointerException {

    /**
     * Hàm có lỗi NullPointer
     *
     * @throws NullPointerException
     */
    public static void example() throws NullPointerException {
        String a = null;
        if (a.equals("hello")) {
            a = "hello";
        }
    }

    // Thực thi chương trình
    public static void main(String[] args) {
        try {
            example();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
