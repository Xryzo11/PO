public class Validator {
    private static Validator INSTANCE = null;

    private Validator() {}

    public void validatePositive(Double value) {
        if (value < 0) {
            throw new LessThanZero(value);
        }
    }

    public static Validator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Validator();
        }
        return INSTANCE;
    }
}