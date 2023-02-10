import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Задание 2.
Пусть дан список сотрудников:
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Иван Савин
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
Иван 4, ...
 */

public class task2 {
    public static void main(String[] args) {
        Map<String, String> listEmployees = new HashMap<String, String>();
        listEmployees.put("Петрова", "Светлана");
        listEmployees.put("Белова", "Кристина");
        listEmployees.put("Мусина", "Анна");
        listEmployees.put("Крутова", "Анна");
        listEmployees.put("Юрин", "Иван");
        listEmployees.put("Лыков", "Петр");
        listEmployees.put("Чернов", "Павел");
        listEmployees.put("Чернышов", "Петр");
        listEmployees.put("Федорова", "Мария");
        listEmployees.put("Светлова", "Марина");
        listEmployees.put("Савин", "Иван");
        listEmployees.put("Рыкова", "Мария");
        listEmployees.put("Лугова", "Марина");
        listEmployees.put("Владимирова", "Анна");
        listEmployees.put("Мечников", "Иван");
        listEmployees.put("Петин", "Петр");
        listEmployees.put("Ежов", "Иван");

        Map<String, Integer> repetedValues = new HashMap<String, Integer>();
        for (String name : listEmployees.values()) {
            if (repetedValues.keySet().contains(name)) {
                repetedValues.put(name, repetedValues.get(name) + 1);
            } else {
                repetedValues.put(name, 1);
            }
        }
        System.out.println(repetedValues);

        List<Integer> numbers = new ArrayList<Integer>(repetedValues.values());
        numbers.sort(Collections.reverseOrder());

        HashMap<String, Integer> sortedValues = new LinkedHashMap<String, Integer>();
        for (int number : numbers) {
            for (String name : repetedValues.keySet()) {
                if (number == repetedValues.get(name)) {
                    sortedValues.put(name, number);
                }
            }
        }
        System.out.println(sortedValues);
    }
}