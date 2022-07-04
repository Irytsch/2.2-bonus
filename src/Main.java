public class Main {

    public static void main(String[] args) {

        int initAccount = 400; // Сумма в рублях на счете клиента изначально

        int refillAcc = 1400; // Сумма пополнения счета клиентом


        int bonus = (refillAcc / 100); // Количество бонусных рублей

        if (refillAcc >= 1000) {
            System.out.println("Количество бонусных рублей:");
            System.out.println(bonus);
            System.out.println("Итоговая сумма на счете клиента:");
            System.out.println(initAccount + refillAcc + bonus);

        } else {
            System.out.println("Количество бонусных рублей:");
            System.out.println(0);
            System.out.println("Итоговая сумма на счете клиента:");
            System.out.println(initAccount + refillAcc);
        }

    }
}
