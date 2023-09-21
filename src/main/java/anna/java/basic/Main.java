package anna.java.basic;
import java.util.Scanner; //подключение библиотеки (храняться процедурые функции)
public class Main {
        public static void main(String[] args) {
//урок 4
            /*System.out.println("Переменные и типы данных");
            int age; //создали переменную
            age = 56; //задали переменной значение
            //либо так int age = 56;
            System.out.println("Возраст: "+ age + ".");
            age = 45;
            System.out.println(age);
            float num = 4.34f;
            double num1 = 5.3457;

            char ch = 'c';
            String user_name = "Alex";
            boolean isHappy = false;
            */
//урок 5
            /*Scanner scan = new Scanner(System.in); //через данную строчку получаем данные от пользователя в тестовом формате
            System.out.print("Введите ваше имя");
            String username = scan.nextLine();
            System.out.println("Привет," + username);*/

            /*int num1 =scan.nextInt(); //используем для обработки и получения чисел
            byte num2 =scan.nextByte(); //для получения определенных типов данных используем определенный next...*/

            /*Scanner scan = new Scanner(System.in);

            short num1 = 50, num2 = 10; //создали переменные
            int res = num1 + num2; // % остаток при делении

            res += 10;
            res++; //увеличили на единицу
            res--; //уменьшить на единицу
            System.out.println("Результат:" + res);*/

//создание калькулятора
          /* Scanner scan = new Scanner(System.in);

            System.out.println("Введите 1 число: ");
            float num1 = scan.nextFloat();
            System.out.println("Введите 2 число: ");
            float num2 = scan.nextFloat();
            float res1 = num1 + num2;
            float res2 = num1 - num2;
            float res3 = num1 * num2;
            float res4 = num1 / num2;
            System.out.println("Результат:");
            System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n");*/
//урок 6 условные конструкции
        /* int a = 15, b =10;
         char sym1 = 'A', sym2 = 'a';
         boolean isHasCar = false;
         if(isHasCar) { // оператор if (уловие)
             System.out.println("Yes");
         } else if(a >=b) { // оператор else if (доп условие)
             System.out.println("second test");
         } else { // оператор else (если не выполняется ни одно из условий)
             System.out.println("No");
         }
            //пример
        Scanner scanner = new Scanner(System.in);
        System.out.print("Role ");
        String role = scanner.nextLine();
        System.out.print("Password ");
        String pass = scanner.nextLine();
        if(role.equals("admin") && pass.equals("12345")) {
            System.out.println("All");
        } else {
            System.out.println("Hello, what is your name?");
            String name = scanner.nextLine();
        } */
//оператор switch
            /*Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("number is 1");
                    break;
                case 2:
                    System.out.println("number is 2");
                    break;
                default:
                    System.out.println("default");
            }*/
//создание калькулятора
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();

            int res;

            System.out.println("Действие: ");
            String action = scanner.nextLine();
            action = scanner.nextLine();

            switch (action) {
                case "+":
                    res = num1 + num2;
                    System.out.println("Результат: " + res);
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println("Результат: " + res);
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println("Результат: " + res);
                    break;
                case "/":
                    if(num2 == 0)
                        System.out.println("Error");
                    else {
                        res = num1 / num2;
                        System.out.println("Результат: " + res);
                    }
                    break;
                default:
                    System.out.println("default");
            }
}
}
