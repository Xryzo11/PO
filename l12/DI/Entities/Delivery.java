package DI.Entities;

import DI.Transports.TransportType;

public class Delivery {
    private final Parcel parcel;
    private final TransportType transportType;
    private final double pricing;

    public Delivery(Parcel parcel, TransportType transportType, double pricing) {
        this.parcel = parcel;
        this.transportType = transportType;
        this.pricing = pricing;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public double getPricing() {
        return pricing;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(parcel.getName()).append("\n");
        sb.append("Weight (kg): ").append(parcel.getWeightKg()).append("\n");
        sb.append("Transport Type: ").append(transportType.getType()).append("\n");
        sb.append("Pricing (PLN): ").append(pricing).append("\n");
        return sb.toString();
    }
}

