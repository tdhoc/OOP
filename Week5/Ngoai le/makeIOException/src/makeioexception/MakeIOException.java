package makeioexception;

import java.io.IOException;

/**
 * Lớp cho ví dụ về ngoại lệ IOException
 *
 * @author 16021008
 */
public class MakeIOException {

    /**
     * Hàm có lỗi đọc file
     *
     * @throws IOException
     */
    public static void Example() throws IOException {
        throw new IOException("Không đọc file được");
    }

    //Thực thi chương trình 
    public static void main(String[] args) {
        try {
            Example();
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
