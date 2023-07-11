package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski");
        Task task1 = new Task("zmywanie", "Umycie naczyń na koniec dnia");
        Task task2 = new Task("spacer z psem", "wyprowadzanie psa 2x dziennie", 3);
        Task task3 = new Task("mycie luster", "Umycie luster gdy będą zakurzone", -2, person);

        System.out.println("Task 2 priority: " + task2.getPriority());
        System.out.println("Task 3 priority: " + task3.getPriority());

        System.out.println("Is task 2 priority low: " + task2.lowPriority());
        System.out.println("Is task 3 priority high: " + task3.highPriority());
    }
}
