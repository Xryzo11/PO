package NO_DI.Transports;

public class Ship extends TransportType {
    private Ship() {
        super("Ship Transport");
    }
    public static final Ship INSTANCE = new Ship();
}
