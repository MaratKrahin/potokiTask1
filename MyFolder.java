package Potoki;

import java.io.File;

public class MyFolder {
    private StringBuilder buildFold = new StringBuilder();

    public StringBuilder getBuildFold() {
        return buildFold;
    }

    public void createFolder(String path) {
        File file = new File(path);
        boolean created = file.mkdir();

        if (created)
            buildFold.append("Создана папка: ").append(file.getName()).append("\n");
        else buildFold.append("Папка ").append(file.getName()).append(" уже существует").append("\n");
    }
}
