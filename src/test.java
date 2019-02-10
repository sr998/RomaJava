import java.util.Scanner; // імпорт сканера

//TODO Название класса в Java пишем с большой буквы, методов с маленькой
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TODO Создать бесконечный цикл в котором программа закончит свое выполнение только когда пользователь этого захочет (добавить ещё один case для этого)
        System.out.println("Перший урок.");
        System.out.println("Виберіть одне з наступних завдань:");
        System.out.println("1 - обчислити площу кола,по заданому радіусу");
        System.out.println("2 - обчислити гіпотенузу прямокутного трикутника з заданими катетами");
        System.out.println("3 - робота з текстом");
        System.out.println("4 - калькулятор для + і -");
        // TODO Переменная x - должна иметь более информативное имя, например option/choice
        int x = in.nextInt();
        //TODO Перенести переменные выше принтов (в начало программы) что бы понятнее было за что отвечает switch и переменная x
        double k1, k2, gipotenuza;
        int r, a, b;
        double pi = 3.14;
        switch (x) {
             case 1:
                System.out.println("Введіть значення радіусу кола: ");
                r = in.nextInt();
                System.out.println("Площа кола рівна: "+pi*r*r);
                break;
            case 2:
                System.out.println("Введіть значення катету №1: ");
                k1 = in.nextDouble();
                System.out.println("Введіть значення катету №2: ");
                k2 = in.nextDouble();
                gipotenuza = k1 * k1 + k2 * k2;
                System.out.println("Гіпотенуза рівна: " + Math.sqrt(gipotenuza));
                break;
            case 3:
                System.out.println("\nМій ріядок №1");
                System.out.println("\tМій ріядок №2");
                System.out.println("aМій ріядок №3");
                break;
            case 4:
                System.out.println("Введіть значення цілого числа №1: ");
                a = in.nextInt();
                System.out.println("Введіть значення цілого числа №2: ");
                b = in.nextInt();
                System.out.println("Сума цих двох чисел буде рівна: "+(a+b));
                System.out.println("Різниця цих двох чисел буде рівна: "+(a-b));
                break;
            default:
                System.out.println("Ви ввели некоректні дані. програму буде завершено");
                break;

        }
    }
}