public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет бонусов за связь");
        int initialAccount = 100;  // Начальный счет
        int deposit = 8855;      // Сумма пополнения
        System.out.println(" Сумма пополнения " + deposit);
        int account;            // Счет всего, без бонуса
        account = initialAccount + deposit;
        int threshold = deposit / 100;  // Порог бонуса
        int totalAmount = account + threshold;  // Счет всего с бонусом

        if (deposit >= 1000) {
            System.out.println(" Итоговый счет " + totalAmount + " Бонусов " + threshold);
        } else {
            System.out.println(" Итоговый счет " + account + " Бонусов 0 ");
        }
        System.out.println("Ура!!! Заработала!:-)");


    }
}
