package Asst_2;

public class Login extends User{
    private int callTime;

    public Login(String userName, String password, int callTime) {
        super(userName, password);
        this.callTime = callTime;
    }

    public int getCallTime() {
        return callTime;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Calltime= " + callTime;
    }
}
