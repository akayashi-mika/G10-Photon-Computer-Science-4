import java.io.IOException;

import com.*;

public class Test {
  public static void main(String[] args) throws IOException  {
    Ocr.setUp(); // one time setup
    Ocr ocr = new Ocr(); // create a new OCR engines
    ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
    String s = ocr.recognize(new File[] {new File("D:\\HEAD2.png")},
      Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
    System.out.println("Result: " + s);
    ocr.stopEngine();
  }
}
