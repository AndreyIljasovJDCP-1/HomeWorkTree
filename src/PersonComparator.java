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

        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }

        int surname1 =o1.getSurname().split(" ").length;
        int surname2 =o2.getSurname().split(" ").length;
        int age1 = o1.getAge();
        int age2 = o2.getAge();

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
