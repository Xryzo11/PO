public class NonNegativeNumberValidator {
    private static NonNegativeNumberValidator INSTANCE;

    private NonNegativeNumberValidator() {}

    public static NonNegativeNumberValidator getInstance() {
        if (INSTANCE == null) {
            return new NonNegativeNumberValidator();
        } else {
            return INSTANCE;
        }
    }

    public void validateInput(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Współrzędna nie może być ujemna");
        }
    }

    public void validateOutput(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Przekształcenie wyprowadza punkt poza dozwolony obszar");
        }
    }
}