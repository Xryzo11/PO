package DI.Transports;

public abstract class TransportType {
    private final String type;
    public TransportType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}

