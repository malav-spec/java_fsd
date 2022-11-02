package Collections_Asst;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static HashMap<String, String> calculateGrade(HashMap<String, Float> map){
        HashMap<String, String> grades = new HashMap<>();
        for(Map.Entry<String, Float> entry : map.entrySet()){
            grades.put(entry.getKey(), entry.getValue() >= 60 ? "PASS" : "FAIL");
        }

        return grades;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 student details: ");
        String name = "";
        float marks = 0;
        HashMap<String,Float> map = new HashMap<>();

        for(int i = 0; i < 3; i++) {
            name = sc.nextLine();
            marks = sc.nextFloat();
            map.put(name, marks);
        }

        System.out.println(calculateGrade(map));

    }
}
