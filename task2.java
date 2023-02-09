import java.util.HashMap;
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
    }
}
