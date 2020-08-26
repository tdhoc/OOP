package utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import static utils.Utils.findFileByName;
import static utils.Utils.readContentFromFile;
import static utils.Utils.writeContentToEndOfFile;
import static utils.Utils.writeContentToFile;

/**
 * Chạy thử chương trình
 * 
 * @author 16021008
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        String path = "D:\\2017-2018 kì 1\\Lập trình HĐT\\IO.txt";

        try {
            String a = readContentFromFile(path);
            System.out.println(a);
            //ghi ra file txt
            writeContentToFile(path);
            // đọc file txt
            String a1 = readContentFromFile(path);
            System.out.println(a1);
            //ghi vào cuối file 
            writeContentToEndOfFile(path);
            //đọc file
            String a2 = readContentFromFile(path);
            System.out.println(a2);
        } catch (IOException e) {
            System.out.println(e);
        }

        //tìm file trong folder
        List<File> findingFile = findFileByName("D:\\2017-2018 kì 1", "IO.txt");
        if (findingFile.isEmpty()) {
            System.out.println("file not found");
        } else {
            for (int i = 0; i < findingFile.size(); i++) {
                System.out.println(findingFile.get(i).getAbsolutePath());
            }
        }
    }
}
