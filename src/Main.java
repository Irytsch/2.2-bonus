public class Main {

    public static void main(String[] args) {

        int initAccount = 400; // Сумма в рублях на счете клиента изначально

        int refillAcc1 = 990; // Клиент пополнил счет на сумму, меньшую 1000 рублей
        int refillAcc2 = 1300; // Клиент пополнил счет на сумму, превышающую 1000 рублей


        int bonus1 = (refillAcc1 / 100); // Количество бонусных рублей в первом сценарии
        int bonus2 = (refillAcc2 / 100); // Количество бонусных рублей во втором сценарии

        if (refillAcc1 >= 1000) {
            System.out.println("Первый сценарий:");
            System.out.println("Количество бонусных рублей:");
            System.out.println(bonus1);
            System.out.println("Итоговая сумма на счете клиента:");
            System.out.println(initAccount + refillAcc1 + bonus1);

        } else {
            System.out.println("Первый сценарий:");
            System.out.println("Количество бонусных рублей:");
            System.out.println(0);
            System.out.println("Итоговая сумма на счете клиента:");
            System.out.println(initAccount + refillAcc1);
        }
            System.out.println();

        if (refillAcc2 >= 1000) {
            System.out.println("Второй сценарий:");
            System.out.println("Количество бонусных рублей:");
            System.out.println(bonus2);
            System.out.println("Итоговая сумма на счете клиента:");
            System.out.println(initAccount + refillAcc2 + bonus2);

        } else {
            System.out.println("Второй сценарий:");
            System.out.println("Количество бонусных рублей:");
            System.out.println(0);
            System.out.println("Итоговая сумма на счете клиента:");
            System.out.println(initAccount + refillAcc2);
        }

    }
}
