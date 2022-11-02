package Interface_Abstract;

import java.util.Scanner;

abstract class Plan {
    private double rate;

    public Plan(double rate) {
        this.rate = rate;
    }

    public abstract void getRate();

    public void calculateBill(int units){
        System.out.println("Bill: " + units*this.rate);
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public double getPlanRate(){
        return this.rate;
    }
}

class DomesticPlan extends Plan{

    public DomesticPlan(double rate) {
        super(rate);
    }

    @Override
    public void getRate() {
        System.out.println("Domestic plan rate: " + this.getPlanRate());
    }

}

class CommercialPlan extends Plan{

    public CommercialPlan(double rate) {
        super(rate);
    }

    @Override
    public void getRate() {
        System.out.println("Commercial plan rate: " + this.getPlanRate());
    }
}

class InstitutionalPlan extends Plan{

    public InstitutionalPlan(double rate) {
        super(rate);
    }

    @Override
    public void getRate() {
        System.out.println("Institutional plan rate: " + this.getPlanRate());
    }
}

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1: Domestic");
        System.out.println("2: Commercial");
        System.out.println("3: Institutional");

        int n = sc.nextInt();
        Plan p;
        switch (n) {
            case 1 -> {
                p = new DomesticPlan(100.0);
                p.calculateBill(100);
            }
            case 2 -> {
                p = new CommercialPlan(90);
                p.calculateBill(100);
            }
            case 3 -> {
                p = new InstitutionalPlan(120);
                p.calculateBill(20);
            }
        }
    }
}
