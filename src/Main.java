public class Main {

    public static void main(String[] args) {

        // входные данные
        int ticketCost = 6000;
        int cost1mile = 20;

        // расчет
        int countBonus = ticketCost / cost1mile;

        System.out.println((countBonus) + " Начислено бонусных милей");
    }
}
