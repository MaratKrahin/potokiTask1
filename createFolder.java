package Potoki;

import java.io.File;

public class createFolder {
    File file;
    static StringBuilder buildFold = new StringBuilder();
    public createFolder(File file) {
        this.file = file;
    }

    public static void crFold (File file){
        boolean created = file.mkdir();

        if(created)
            buildFold.append("Создана папка: ").append(file.getName()).append("\n");
        else  buildFold.append("Папка ").append(file.getName()).append(" уже существует").append("\n");
    }
}
