package DI.Entities;

import java.util.ArrayList;

public class Parcel {
    private final String name;
    private final ArrayList<Object> contents;
    private final String address;
    private final double weightKg;

    public Parcel(String name, ArrayList<Object> contents, String address, double weightKg) {
        this.name = name;
        this.contents = contents;
        this.address = address;
        this.weightKg = weightKg;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Object> getContents() {
        return contents;
    }

    public String getAddress() {
        return address;
    }

    public double getWeightKg() {
        return weightKg;
    }
}

