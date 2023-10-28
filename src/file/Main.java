package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("xa bor");
        }else {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("salom java\n");
        fileWriter.write("hello java\n");
        fileWriter.write("hello world");
        fileWriter.flush();
        fileWriter.close();


        FileReader fileReader = new FileReader(file);
        int read = fileReader.read();
        while (read != -1){
            System.out.print((char) read);
            read = fileReader.read();
        }
        fileReader.close();


    }

}
