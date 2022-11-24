import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Object o = new Scanner(System.in);
//
//
//
//        Scanner scanner = null;
//
//        if (o instanceof Scanner) scanner = (Scanner) o;
//
//        if (scanner != null) {
//            scanner.nextInt();
//        }
//
//
//        Object o1 = new String();
//
//        Object o2 = new Integer(15);


        Object[] objects = {10, "Привет", 3.14}; //Здесь происходит автоупаковка.
        for (Object o : objects) {
            if (o instanceof String){
                String s = (String) o;
                System.out.println(s);
            }
        }

        ArrayList<Integer> numbers = new ArrayList(); //Сщхраняет Objects

        for (int i = 0; i < 10; i ++){ // Сохранять в коллекцию 10,20...100
            numbers.add(i * 10);
            //numbers.add(i * 10.4f);
        }
        //numbers.add(10.4f);

        int sum = 0;
        for (Integer o : numbers){
            sum = sum + /*(Integer)*/ o;
        }

        System.out.println(sum);

        //ОсновнойТип<ТипПараметр>
        //ОсновнойТип<ТипПараметр1, ТипПараметр2, ТипПараметр3>

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(7, "Привет");
        map.put(15, "Hello");

        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("Привет");
        listHello.add("Hi");


        ArrayList<String> listBye = new ArrayList();
        listBye.add("Пока");
        listBye.add("Good Bye");


        ArrayList<ArrayList<String>> list = new ArrayList();
        list.add(listHello);
        list.add(listBye);

        for (ArrayList<String> spisok : list) {
            for (String s : spisok) {
                System.out.println(s);
            }
        }

    }
}

/*
*     То что делаем мы в коде                                   То во что преобразует компилятор
* ArrayList<Integer> list = new ArrayList<Integer>();            ArrayList list = new ArrayList
* list.add(1);                                                   list.add((Integer) 1);
* int x = list.get(0);                                           int x = (Integer) list.get(0);
* list.set(0,10);                                                list.set(0, (Integer) 10);
*
* */