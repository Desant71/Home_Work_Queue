import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> people = generateClient();
        Queue<Person> at = new LinkedList<>(people);

        while (!at.isEmpty()) {
            Person person = at.poll();
            int ticket = person.getTicket();
            ticket = ticket - 1;
            person.setTicket(ticket);
            System.out.printf("\n%s %s прокатился на аттракционе, у него осталось %d ,билетов:", person.getName(), person.getSureName(), ticket);
            if (ticket > 0) {
                at.offer(person);
            }
        }
    }

    private static List<Person> generateClient() {
        return List.of(
                new Person("Nikita", "Filyakin", 21),
                new Person("Vasyli", "Koshkin", 5),
                new Person("Anna", "Rapuncel", 1)
        );
    }

}