package genericmethods;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] strings = {"Tom", "Alice","Sam", "Sveta","Bob", "Helen"};
        Integer[] integers = {23, 1, 12, 153, 225};
        printer.<String>print(strings);
        printer.<Integer>print(integers);
    }
}
