import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Comparator<Person> personComparatorLambda = (o1, o2) -> {
            if (o1 == null) {
                return -1;
            }
            if (o2 == null) {
                return 1;
            }

            int surname1 = o1.getSurname().split(" ").length;
            int surname2 = o2.getSurname().split(" ").length;
            int age1 = o1.getAge();
            int age2 = o2.getAge();

            if (surname1 >= 4 && surname2 >= 4) {
                return Integer.compare(age1, age2);
            }

            if (surname1 > surname2) {
                return 1;
            } else if (surname1 < surname2) {
                return -1;
            } else {
                return Integer.compare(age1, age2);
            }
        };

        personList.add(null);
        personList.add(new Person("Михаил", "Паниковский (человек без паспорта)", 60));
        personList.add(new Person("Остап", "Берта Мария Бендер Бей (Бендер-Задунайский)", 33));
        personList.add(new Person("Атос", "граф де Ля Фер", 35));
        personList.add(new Person("Генри", "Индиана Джонс младший", 45));
        personList.add(new Person("Оскар", "де Ля Хойя", 25));
        personList.add(new Person("Гай", "Юлий Цезарь", 55));
        personList.add(new Person("Владимир", "Красное Солнышко", 50));
        personList.add(new Person("Вася", "Иванов", 18));
        personList.add(new Person("Вася", "Пупкин", 18));
        personList.add(null);

        personList.sort(personComparatorLambda);
        System.out.println("Список->>");

        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println("Удален элемент: " + personList.remove(personList.indexOf(null)));
        System.out.println("Удален элемент: " + personList.remove(personList.indexOf(null)));

        System.out.println("Список->>");

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}