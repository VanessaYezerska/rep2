public class Task {
    public static void main(String[] args) {
        int n = 127;

        if (n > 50 && n < 100) {  // якщо число n більше 50, і менше за 100 друкуємо:
            System.out.println(n + " є в проміжку (50; 100)");
        } else { // інакше:
            System.out.println(+n + " немає в проміжку (50; 100)");
        }

    }
}

//Task2
class Task5 {
    public static void main(String[] args) {
        int n = 532;
        int max = 0; // змінна для зберігання найбільшої цифри
        int y = n / 100; // знаходимо 1 цифру(5)
        int v = (n / 10) % 10; //знаходимо 2 цифру(3)
        int o = n % 10; // знаходимо 3 цифру(2)

        if (y > max) { // якщо а більша за поточний максимум, тоді ми зберігаємо її як новий максимум (max = 5)
            max = y;
            if (v > max) // max = 3
                max = v;
            if (o > max) // max = 2
                max = o;
        }
        System.out.println("Найбільше число-" +  max);
    }
}
class task6 {
    public static void main(String[] args) {

        int y = 2;// поверх, на якому ми знаходимось
        int v = 1;// поверх, який нам потрібен

        if (v == y) {
            System.out.println("Ви вже знаходитесь на цьому поверсі");
        }

        if (v > y) {
            if (v == 2) {
                System.out.println("Ліфт підіймається на 3 поверх");
            } else {
                System.out.println("Ліфт підіймається на " + v + " поверх");
            }
        } else if (v < y) {
            if (v == 2) {
                System.out.println("Ліфт спускається на 1 поверх");
            } else {
                System.out.println("Ліфт спускається на " + v + " поверх");
            }


        }
    }

}


class Task7{
    public static void main(String[] args) {
        String y = "Yes";
        System.out.println("Чи погоджуєтесь Ви?");

        switch (y){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Помилка");
                break;



        }
    }
}
