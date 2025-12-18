package DI.Transports;

public class Plane extends TransportType {
    private Plane() {
        super("Plane Transport");
    }
    public static final Plane INSTANCE = new Plane();
}

