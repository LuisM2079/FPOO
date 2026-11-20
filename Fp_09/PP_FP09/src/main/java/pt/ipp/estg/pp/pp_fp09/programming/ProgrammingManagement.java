package pt.ipp.estg.pp.pp_fp09.programming;

/**
 *
 * @author luism
 */
public class ProgrammingManagement {

    private static final int INITIAL_CAPACITY = 10;

    private Person[] people;
    private int numberOfPeople;

    public ProgrammingManagement() {
        this.people = new Person[INITIAL_CAPACITY];
        this.numberOfPeople = 0;
    }

    public boolean addPerson(Person person) {
        if (person == null || indexOf(person.getCitizenCard()) != -1) {
            return false;
        }
        if (numberOfPeople == people.length) {
            growArray();
        }
        people[numberOfPeople++] = person;
        return true;
    }

    public boolean removePerson(Person person) {
        if (person == null) {
            return false;
        }
        int pos = indexOf(person.getCitizenCard());
        if (pos == -1) {
            return false;
        }
        for (int i = pos; i < numberOfPeople - 1; i++) {
            people[i] = people[i + 1];
        }
        people[--numberOfPeople] = null;
        return true;
    }

    public void listPeople() {
        if (numberOfPeople == 0) {
            System.out.println("No people");
            return;
        }
        for (int i = 0; i < numberOfPeople; i++) {
            people[i].print();
            System.out.println();
        }
    }

    public void listProjectManagers() {
        boolean found = false;
        for (int i = 0; i < numberOfPeople; i++) {
            if (people[i] instanceof ProjectManager) {
                people[i].print();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No project managers");
        }
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public Person findPerson(String citizenCard) {
        int pos = indexOf(citizenCard);
        return pos == -1 ? null : people[pos];
    }

    private int indexOf(String citizenCard) {
        for (int i = 0; i < numberOfPeople; i++) {
            if (people[i].getCitizenCard().equals(citizenCard)) {
                return i;
            }
        }
        return -1;
    }

    private void growArray() {
        Person[] bigger = new Person[people.length * 2];
        for (int i = 0; i < numberOfPeople; i++) {
            bigger[i] = people[i];
        }
        people = bigger;
    }
}
