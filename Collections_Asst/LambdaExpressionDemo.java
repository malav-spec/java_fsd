package Collections_Asst;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {

        static List<String> places = new ArrayList<>();
        public static List getPlaces(){

            places.add("Nepal, Kathmandu");
            places.add("Nepal, Pokhara");
            places.add("India, Delhi");
            places.add("USA, New York");
            places.add("Africa, Nigeria");

            return places;
        }

        public static void main( String[] args ) {

            List<String> myPlaces = getPlaces();
            System.out.println("Places from USA:");
            myPlaces.stream()
                    .filter((p) -> p.startsWith("USA"))
                    .map((p) -> p.toUpperCase())
                    .sorted()
                    .forEach((p) -> System.out.println(p));
        }

    }

