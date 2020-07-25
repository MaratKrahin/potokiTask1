package Potoki;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        MyFile createMyFile = new MyFile();
        MyFolder createFolder = new MyFolder();
        List<String> foldersList = new ArrayList<>();
        foldersList.add("/Users/a1/IdeaProjects/Games");
        foldersList.add("/Users/a1/IdeaProjects/Games/src");
        foldersList.add("/Users/a1/IdeaProjects/Games/res");
        foldersList.add("/Users/a1/IdeaProjects/Games/savegames");
        foldersList.add("/Users/a1/IdeaProjects/Games/temp");
        foldersList.add("/Users/a1/IdeaProjects/Games/src/main");
        foldersList.add("/Users/a1/IdeaProjects/Games/src/test");
        foldersList.add("/Users/a1/IdeaProjects/Games/res/drawables");
        foldersList.add("/Users/a1/IdeaProjects/Games/res/vectors");
        foldersList.add("/Users/a1/IdeaProjects/Games/res/icons");

        List<String> filesList = new ArrayList<>();
        filesList.add("/Users/a1/IdeaProjects/Games/src/main/Main.java");
        filesList.add("/Users/a1/IdeaProjects/Games/src/main/Utils.java");
        filesList.add("/Users/a1/IdeaProjects/Games/temp/temp.txt");

        for (String file : foldersList) {
            createFolder.createFolder(file);
        }

        for (String file : filesList) {
            createMyFile.createFile(file);
        }

        try (FileWriter fw = new FileWriter("/Users/a1/IdeaProjects/Games/temp/temp.txt")) {
            fw.write(String.valueOf(createFolder.getBuildFold()));
            fw.write(String.valueOf(createMyFile.getBuildFile()));
        } catch (IOException e) {
            System.err.print("Something went wrong");
        }


    }
}
