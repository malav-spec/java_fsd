package FileIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FIS {
    private static boolean searchWord(String word, File file) throws IOException {
        Set<String> words = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        String[] wordArr;
        while((s = br.readLine()) != null){
            wordArr = s.split(" ");
            words.addAll(Arrays.asList(wordArr));
        }
        return words.contains(word);
    }

    private static void displayUpper(FileInputStream fis) throws IOException{
        int ch;
        while((ch = fis.read()) != -1){
            System.out.println(Character.toUpperCase((char)ch));
        }
    }

    private static void FISDemo(String name){
        try (FileInputStream fis = new FileInputStream(name)){
            int ch;
            int lines = 0;
            while((ch = fis.read()) != -1){
                if((char)ch == '\n'){
                    lines++;
                }
            }
            lines++;
            System.out.println(lines);
        }catch (IOException e){
            System.out.println(e);
        }
    }

    private static void copyFile(String src, String dest){
        try {
            Files.copy(Paths.get(src), new FileOutputStream(dest));
            System.out.println("File copied");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        String name = "./FileIO/Hello.txt";

//        FISDemo(name);
//        System.out.println(searchWord("isi", new File(name)));
//        displayUpper(new FileInputStream(name));
        copyFile(name, "FileIO/Hi.txt");

    }
}
