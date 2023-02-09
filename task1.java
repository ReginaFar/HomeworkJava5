import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Задание 1.
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

public class task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> numbersBase = new HashMap<String, List<Integer>>();
        List<Integer> numbers1 = new ArrayList<Integer>();
        List<Integer> numbers2 = new ArrayList<Integer>();
        List<Integer> numbers3 = new ArrayList<Integer>();
        numbers1.add(5456732);
        numbers1.add(5903471);
        numbers2.add(5219067);
        numbers3.add(5023415);
        numbers3.add(5553014);
        numbers3.add(5447812);
        numbersBase.put("Иванова Ирина", numbers1);
        numbersBase.put("Петров Сергей", numbers2);
        numbersBase.put("Калинина Евгения", numbers3);
        System.out.println(numbersBase);
    }
}