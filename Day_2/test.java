package Day_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import Day_3.Calculator;
class Room{
    private int room_no;
    private String room_type;
    private double room_area;
    private String AC_machine;

    public void setData(int room_no, String room_type, double room_area, String AC_machine) {
        this.room_no = room_no;
        this.room_type = room_type;
        this.room_area = room_area;
        this.AC_machine = AC_machine;
    }

    public void displayData(){
        System.out.println("Room no: " + room_no);
        System.out.println("Room_type: " + room_type);
        System.out.println("Room Area: " + room_area);
        System.out.println("AC Machine: " + AC_machine);
    }
    public Room() {
    }

    public int getRoom_no() {
        return room_no;
    }

    public void setRoom_no(int room_no) {
        this.room_no = room_no;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public double getRoom_area() {
        return room_area;
    }

    public void setRoom_area(double room_area) {
        this.room_area = room_area;
    }

    public String getAC_machine() {
        return AC_machine;
    }

    public void setAC_machine(String AC_machine) {
        this.AC_machine = AC_machine;
    }
}

class A{}

class B extends A{}

public class test {

    private static void findMin(int a, int b, int c) {
        System.out.println(Math.min(a, Math.min(b,c)));
    }

    private static String middleChar(String s){
        if(s.length() % 2 == 0){
            return "" + s.charAt((s.length()/2) - 1) + s.charAt(s.length()/2);
        }
        return ""+s.charAt(s.length()/2);
    }

    private static int countVowels(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        int count = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(char c : charArray){
            if(vowels.contains(c)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question Number: ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                findMin(1,2,3);
                break;
            case 2:
                System.out.println("The middle character is: " + middleChar("12456"));
                break;
            case 3:
                System.out.println("The number of vowels are: " + countVowels("HCL technologies"));
                break;
            case 4:
                Room room = new Room();
                break;
            case 5:
                break;
            case 6:
                Addition addition = new Addition();
                System.out.println(addition.add(1,2,3,4,5,6));
                break;
            case 7:
                break;
            case 8:
                break;
        }
        new Calculator().add(1,2);
    }



}
