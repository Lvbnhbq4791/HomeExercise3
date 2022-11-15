public class BoxMinimumSizeException extends RuntimeException {
    public BoxMinimumSizeException(int q, String tip, String ending) {
        super("Коробка не заполнена осталось-" + "\n" +" заполнить ещё " + q + " яче" + ending + " " + tip);
    }
}
