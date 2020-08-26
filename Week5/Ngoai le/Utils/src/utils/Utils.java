package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Lớp tiện ích Utils
 *
 * @author 16021008
 */
public class Utils {

    /**
     * Hàm đọc một tệp .txt từ ổ cứng
     *
     * @param path đường dẫn đến tệp txt cần đọc
     * @return dữ liệu đọc được từ file
     * @throws java.io.FileNotFoundException
     */
    public static String readContentFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file, "UTF-8").useDelimiter("vi du ngan cach boi dau phan cach");
        String content = null;
        if (scanner.hasNext()) {
            content = scanner.next();
        }
        return content;
    }

    /**
     * Hàm xuất một xâu vào ổ cứng. Nếu tệp đã có nội dung thì xóa nội dung đó
     * đi và ghi nội dung mới vào
     *
     * @param path đường dẫn đến tệp txt cần ghi
     * @throws java.io.IOException
     */
    public static void writeContentToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        PrintWriter out = new PrintWriter(writer);
        out.print("Ghi đè lên nội dung ban đầu có sẵn. ");
        out.close();
    }

    /**
     * Hàm xuất một xâu vào ổ cứng. Nếu tệp đã có nội dung thì bổ sung nội dung
     * mới vào cuối tệp hiện tại.
     *
     * @param path đường dẫn tới thư mục chứa file cần tìm
     * @throws IOException
     */
    public static void writeContentToEndOfFile(String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file, true);
        String newContent = "Bổ sung nội dung mới vào cuối tệp. ";
        PrintWriter out = new PrintWriter(writer);
        out.print(newContent);
        out.close();
    }

    /**
     * Hàm tìm kiếm một tệp trong một thư mục
     *
     * @param folderPath đường dẫn tới thư mục có thể chứa file cần tìm
     * @param fileName tên của file cần tìm
     * @return file được tìm thấy
     * @throws java.io.FileNotFoundException
     */
    public static List<File> findFileByName(String folderPath, String fileName) throws FileNotFoundException {
        List<File> findedFile = new ArrayList<>();
        File folder = new File(folderPath);
        File[] listFile = folder.listFiles();
        if (listFile != null) {
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].getName().endsWith(fileName)) {
                    findedFile.add(listFile[i]);
                }
                if (listFile[i].isDirectory()) {
                    findedFile.addAll(findFileByName(listFile[i].getAbsolutePath(), fileName));
                }
            }
        }
        return findedFile;
    }
}
