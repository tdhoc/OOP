package makefilenotfoundexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Lớp cho ví dụ về ngoại lệ FileNotFoundException
 *
 * @author 16021008
 */
public class MakeFileNotFoundException {

    /**
     * Hàm có lỗi không tìm thấy file
     *
     * @throws FileNotFoundException
     */
    public static void FoundFile() throws FileNotFoundException {
        File file = new File("file.txt");
        FileInputStream a = new FileInputStream(file);
    }

    // Thực thi chương trình
    public static void main(String[] args) {
        try {
            FoundFile();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
