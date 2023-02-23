public class Main {
    public static void main(String[] args) {
        int score = 200;//начальный счет клиента.
        int depositAmount = 1500; //сумма пополнения счета.

        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;//формула подсчета бонусных рублей за каждые доп внесенные 100р на депозит.
        } else {
            bonus = 0;
        }
        int balance = score + depositAmount + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}