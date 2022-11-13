import java.util.Random;

public class MagicBox<T> {
    public T[] items;

    public MagicBox(int boxVolume) {
        this.items = (T[]) new Object[boxVolume];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
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
                throw new BoxMinimum(r, tip, ending);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
