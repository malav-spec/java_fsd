package Day_2;

public class Addition {
    public int add(int... values){
        int sum = 0;
//        String prev = "" + values[0];
        for(int i : values){
//            prev += i + "+";
            sum += i;
        }

        return sum;
    }
}
