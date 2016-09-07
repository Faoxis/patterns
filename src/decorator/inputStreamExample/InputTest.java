package decorator.inputStreamExample;

import java.io.*;

/**
 * Created by sergei on 9/7/16.
 */
public class InputTest {
    public static void main(String[] args) throws FileNotFoundException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/decorator/inputStreamExample/test.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
