public class Main {
    public static void main(String[] args) {
        MagicBox<String> boxs = new MagicBox<>(3);
        String[] text = {"Весна", "Лето"};
        for (String s : text) {
            boxs.add(s);
        }
        System.out.print(boxs.pick("типа String"));
        MagicBox<Integer> boxss = new MagicBox<>(3);
        Integer[] number = {100, 200,300,400};
        for (Integer n : number) {
            boxss.add(n);
        }
        System.out.print(" " + boxss.pick("типа int"));
    }
}
