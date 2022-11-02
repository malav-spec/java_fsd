class OCJP{
    static void nestedTry(){
        try{
            try{
                int x = 2;
                int a = x/0;

            }catch (ArithmeticException e){
                System.out.println(e);
            }

            try{
                int a[] = new int[3];
                a[6] = 2;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class OCJPException {
    public static void main(String[] args) {
        OCJP.nestedTry();
    }
}
