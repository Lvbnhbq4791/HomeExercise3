public class BoxMinimum extends RuntimeException {
    public BoxMinimum(int q, String tip, String ending) {
        super("Коробка не заполнена осталось заполнить ещё " + q + " яче" + ending + " " + tip);
    }
}
