import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PracticalWork11 {

    // === ЗАДАНИЕ 1 ===
    public static void task1() {
        String developer = "Иванов Иван Иванович";
        Date dateReceived = new GregorianCalendar(2025, Calendar.OCTOBER, 10, 14, 30).getTime();
        Date dateSubmitted = new Date(); // текущая дата и время

        System.out.println("=== ЗАДАНИЕ 1 ===");
        System.out.println("Разработчик: " + developer);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
        System.out.println();
    }

    // === ЗАДАНИЕ 2 ===
    public static void task2(Scanner sc) {
        System.out.println("=== ЗАДАНИЕ 2 ===");
        System.out.println("Введите дату (в формате ГГГГ-ММ-ДД): ");
        String input = sc.nextLine();

        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date userDate = df.parse(input);
            Date currentDate = new Date();

            System.out.println("Текущая системная дата: " + currentDate);
            System.out.println("Введённая дата: " + userDate);

            if (userDate.before(currentDate))
                System.out.println("Введённая дата раньше текущей.");
            else if (userDate.after(currentDate))
                System.out.println("Введённая дата позже текущей.");
            else
                System.out.println("Даты совпадают!");
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты!");
        }
        System.out.println();
    }

    // === ЗАДАНИЕ 3 ===
    static class Student {
        private String firstName;
        private String lastName;
        private Date birthDate;

        public Student(String firstName, String lastName, Date birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
        }

        public String getFormattedBirthDate(int formatType) {
            DateFormat df;
            switch (formatType) {
                case 1: df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.getDefault()); break;
                case 2: df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault()); break;
                case 3: df = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault()); break;
                default: df = DateFormat.getDateInstance();
            }
            return df.format(birthDate);
        }

        @Override
        public String toString() {
            return String.format("Студент: %s %s | Дата рождения: %s",
                    firstName, lastName, getFormattedBirthDate(2));
        }
    }

    public static void task3() {
        System.out.println("=== ЗАДАНИЕ 3 ===");
        Calendar cal = new GregorianCalendar(2004, Calendar.MAY, 14);
        Student st = new Student("Алексей", "Петров", cal.getTime());
        System.out.println(st);

        System.out.println("Форматы даты рождения:");
        System.out.println("Короткий: " + st.getFormattedBirthDate(1));
        System.out.println("Средний: " + st.getFormattedBirthDate(2));
        System.out.println("Полный: " + st.getFormattedBirthDate(3));
        System.out.println();
    }

    // === ЗАДАНИЕ 4 ===
    public static void task4(Scanner sc) {
        System.out.println("=== ЗАДАНИЕ 4 ===");
        try {
            System.out.print("Введите год: ");
            int year = sc.nextInt();
            System.out.print("Введите месяц (1–12): ");
            int month = sc.nextInt() - 1; // месяцы с 0
            System.out.print("Введите число: ");
            int day = sc.nextInt();
            System.out.print("Введите часы: ");
            int hour = sc.nextInt();
            System.out.print("Введите минуты: ");
            int minute = sc.nextInt();
            sc.nextLine(); // очистка

            Calendar cal = new GregorianCalendar(year, month, day, hour, minute);
            Date date = cal.getTime();

            System.out.println("Объект Date: " + date);
            System.out.println("Объект Calendar: " + cal.getTime());
        } catch (Exception e) {
            System.out.println("Ошибка ввода!");
        }
        System.out.println();
    }

    // === ЗАДАНИЕ 5 ===
    public static void task5() {
        System.out.println("=== ЗАДАНИЕ 5 ===");
        final int N = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Время вставки
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long end = System.nanoTime();
        long arrayAdd = end - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        end = System.nanoTime();
        long linkedAdd = end - start;

        // Время поиска
        start = System.nanoTime();
        arrayList.contains(N - 1);
        end = System.nanoTime();
        long arraySearch = end - start;

        start = System.nanoTime();
        linkedList.contains(N - 1);
        end = System.nanoTime();
        long linkedSearch = end - start;

        // Время удаления
        start = System.nanoTime();
        arrayList.remove(N / 2);
        end = System.nanoTime();
        long arrayRemove = end - start;

        start = System.nanoTime();
        linkedList.remove(N / 2);
        end = System.nanoTime();
        long linkedRemove = end - start;

        System.out.println("ArrayList:");
        System.out.println("Добавление: " + TimeUnit.NANOSECONDS.toMillis(arrayAdd) + " мс");
        System.out.println("Поиск: " + arraySearch + " нс");
        System.out.println("Удаление: " + arrayRemove + " нс");

        System.out.println("\nLinkedList:");
        System.out.println("Добавление: " + TimeUnit.NANOSECONDS.toMillis(linkedAdd) + " мс");
        System.out.println("Поиск: " + linkedSearch + " нс");
        System.out.println("Удаление: " + linkedRemove + " нс");

        System.out.println();
    }

    // === MAIN ===
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        task1();
        task2(sc);
        task3();
        task4(sc);
        task5();

        sc.close();
    }
}
