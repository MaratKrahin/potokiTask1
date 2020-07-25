package Potoki;

import java.io.File;
import java.io.IOException;

public class MyFile {
    private StringBuilder buildFile = new StringBuilder();

    public StringBuilder getBuildFile() {
        return buildFile;
    }

    public void createFile(String path) {
        File file = new File(path);
        try {
            boolean created = file.createNewFile();
            if (created)
                buildFile.append("Создан файл: ").append(file.getName()).append("\n");
            else buildFile.append("Файл ").append(file.getName()).append(" уже существует").append("\n");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
