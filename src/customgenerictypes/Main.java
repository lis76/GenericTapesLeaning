package customgenerictypes;

public class Main {
    public static void main(String[] args) {
//        Account <Integer> acc1 = new Account(12345, 5000);
//        System.out.println(acc1.getId());

        Account<String> acc2 = new Account("sid1234563", 5000);
        System.out.println(acc2.getId());

//        int a = acc1.getId() + 10; //Опасное преобразование типов
//        System.out.println(a);
    }
}
