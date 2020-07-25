package Potoki;

import java.io.File;
import java.io.IOException;

public class createFile {
    File file;
    static StringBuilder buildFile = new StringBuilder();
    public createFile(File file) {
        this.file = file;
    }

    public static void crFile (File file) throws IOException {

        try
        {
            boolean created = file.createNewFile();
            if(created)
                buildFile.append("Создан файл: ").append(file.getName()).append("\n");
            else buildFile.append("Файл ").append(file.getName()).append(" уже существует").append("\n");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
