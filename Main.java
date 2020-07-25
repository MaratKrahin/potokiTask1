package Potoki;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<File> foldersList = new ArrayList<>();
        foldersList.add(new File("/Users/a1/IdeaProjects/Games"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/src"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/res"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/savegames"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/temp"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/src/main"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/src/test"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/res/drawables"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/res/vectors"));
        foldersList.add(new File("/Users/a1/IdeaProjects/Games/res/icons"));

        List<File> filesList = new ArrayList<>();
        filesList.add(new File("/Users/a1/IdeaProjects/Games/src/main", "Main.java"));
        filesList.add(new File("/Users/a1/IdeaProjects/Games/src/main", "Utils.java"));
        filesList.add(new File("/Users/a1/IdeaProjects/Games/temp", "temp.txt"));

        for (int i = 0; i < foldersList.size(); i++) {
         createFolder.crFold(foldersList.get(i));
        }

        for (int i = 0; i < filesList.size(); i++) {
            createFile.crFile(filesList.get(i));
        }

        try {
        FileWriter fw = new FileWriter("/Users/a1/IdeaProjects/Games/temp/temp.txt");
        fw.write(String.valueOf(createFolder.buildFold));
        fw.write(String.valueOf(createFile.buildFile));
        fw.close();
        } catch (IOException e) {
            System.err.print("Something went wrong");
        }




    }
}
