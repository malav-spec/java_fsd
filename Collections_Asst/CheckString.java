package Collections_Asst;

public class CheckString {
    public static void main(String[] args) {
        String s = "Rome";

        if(s.length() > 7 && s.startsWith("R")){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
