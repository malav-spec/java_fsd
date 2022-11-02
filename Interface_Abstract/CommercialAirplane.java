package Interface_Abstract;

public class CommercialAirplane implements PassengerAirplane, CargoAirplane{
    @Override
    public void cargoLoad() {
        System.out.println("Shows cargo load");
    }

    @Override
    public void planeType() {
        System.out.println("Boeing");
    }

    @Override
    public void seats() {
        System.out.println("Shows number of seats");
    }

    public static void main(String[] args) {
        new CommercialAirplane().planeType();
    }
}
