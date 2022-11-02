package Asst_6;

public class UserAccount implements UserLogin{
    @Override
    public void login(String username, String password) throws InvalidUserAccountException {
        if(username.length() < 6 || username.length() > 8){
            throw new InvalidUserAccountException("UserName length should be between 6 and 8!");
        }

        for(int i = 0; i < password.length(); i++){
            char chr = password.charAt(i);
            if(i == 0 && !Character.isUpperCase(chr)){
                throw new InvalidUserAccountException("First letter of password should be capital");
            }
            else if(i!=0 && Character.isUpperCase(chr)){
                throw new InvalidUserAccountException("All letters should be lowercase");
            }
        }

        System.out.println("Login success!");
    }

    public static void main(String[] args) throws InvalidUserAccountException {
        new UserAccount().login("malavD", "Ab");
    }
}
