import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private final int maxWords;

    public PersonComparator() {
        this.maxWords = 0;
    }

    public PersonComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {

        int surname1 = o1.getSurname() != null ? o1.getSurname().split(" ").length : 0;
        int surname2 = o2.getSurname() != null ? o2.getSurname().split(" ").length : 0;
        int age1 = o1.getAge() != null ? o1.getAge() : 0;
        int age2 = o2.getAge() != null ? o2.getAge() : 0;

        if (surname1 >= maxWords && surname2 >= maxWords) {
            return Integer.compare(age1, age2);
        }

        if (surname1 > surname2) {
            return 1;
        } else if (surname1 < surname2) {
            return -1;
        } else {
            return Integer.compare(age1, age2);
        }

    }
}
