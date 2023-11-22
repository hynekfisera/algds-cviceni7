public class Main {
    public static void main(String[] args) {
        String[] pole = {"Jedna", "Dva", "Tři"};
        String prvek = getPrvekPole(pole, 0); // "Jedna"
        System.out.println(prvek);
    }

    public static String getPrvekPole(String[] pole, int index) {
        if (index < 0 || index >= pole.length) {
            return null;
        }
        return pole[index];
    }
}