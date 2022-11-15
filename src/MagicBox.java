import java.util.Random;

public class MagicBox<T> {
    public T[] items;
    public int counter;
    Random random = new Random();

    public MagicBox(int boxVolume) {
        this.items = (T[]) new Object[boxVolume];
        this.counter = 0;
    }

    public boolean add(T item) {
        if (counter < items.length) {
            items[counter] = item;
            counter++;
            return true;
        }
        return false;
    }

    public T pick(String tip) {
        int f = 0;
        for (T t : items) {
            if (t != null) {
                f++;
            } else {
                int r = items.length - f;
                String ending = (r % 10 == 1 && r != 11) ? "йку" : (r % 20 > 1 && r % 20 < 5) ? "йки" : "ек";
                throw new BoxMinimumSizeException(r, tip, ending);
            }
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
