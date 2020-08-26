package makearrayindexofboundexception;

/**
 * Lớp cho ví dụ về ngoại lệ ArrayIndexOutOfBoundsException
 *
 * @author 16021008
 */
public class MakeArrayIndexOfBoundException {

    /**
     * Hàm có lỗi ArrayIndexOutOfBounds
     *
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void example() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[2];
        a[5] = 10;
    }

    // Thực thi chương trình
    public static void main(String[] args) {
        try {
            example();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
