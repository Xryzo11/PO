public class LessThanZero extends IllegalArgumentException {
    public LessThanZero(Double value) {
        super("Wymiar bryły musi być większy lub równy zero. Podano wartość: " + value);
    }
}
