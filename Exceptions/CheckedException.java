package Exceptions;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws InvalidAgeException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.read();//IOException

//        int a = 2;
//        int x = a / 0; //Raise unchecked exception
        int x;
//        try{
//            int a = 2;
//            x = a/0;
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }finally {
//            x = 0 / 2;
//            System.out.println(x);
//        }

//        Nested Try

//        try{
//            try{
//                int a = 2;
//                x = a / 0;
//                int arr[] = new int[3];
//                arr[4] = 4;
//            }catch (ArithmeticException e){
//                System.out.println(e);
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }

//        Try with resources
//        try(FileInputStream fis = new FileInputStream("name.txt")){
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        int age = 17;
        if(age <= 18){
            throw new InvalidAgeException("Age must be greater than 18");
        }


    }
}
