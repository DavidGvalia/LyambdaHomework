public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.sum.apply(1,2);
        int b = calc.subtraction.apply(1,1);
        int c = calc.division.apply(a,b);/* Ошибка возникает из-за деления на 0. Для решения данной проблемы мы можем
        использовать оператор if для проверки второй переменной(не равна ли нулю). И при равенстве завершать программу
        с выводом в консоли сообщения о том, что пользователь делит на 0 */

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
    }
}
