package NO_DI.Transports;

public class Truck extends TransportType {
    private Truck() {
        super("Truck Transport");
    }
    public static final Truck INSTANCE = new Truck();
}
