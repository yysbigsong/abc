package domain;

import lombok.Cleanup;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        /*try {*/
        //自动清理流，用在局部变量前
        @Cleanup InputStream in = new FileInputStream("D:/test/a.txt");
        @Cleanup OutputStream out = new FileOutputStream("D:test/ttt.txt");
        byte[] bytes = new byte[1024];
        while (true) {
            int count = in.read(bytes);
            if (count == -1) break;
            out.write(bytes, 0, count);
        }
        /*} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*//* finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
