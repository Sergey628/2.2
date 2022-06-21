public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет бонусов за связь");
        int score = 100;  // Начальный счет
        int deposit = 55;      // Сумма пополнения
        System.out.println(" Сумма пополнения " + deposit);
        int x;            // Счет всего, без бонуса
        x = score + deposit;
        int bonus = deposit / 100;  // Бонус
        int z = x + bonus;  // Счет всего с бонусом

        if (deposit >= 1000) {
            System.out.println(" Итоговый счет " + z + " Бонусов " + bonus);
        } else {
            System.out.println(" Итоговый счет " + x + " Бонусов 0 ");
        }
        ;
        System.out.println("Ура!!! Заработала!:-)");


    }
}
