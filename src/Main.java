public class Main {
    public static void main(String[] args) {
            CreditPaymentService service = new CreditPaymentService();
            int creditSum = 1_000_000;
            double yearsPercent = 0.0999;
            int period = 3;
            int monthsPayment = service.calculate(creditSum, yearsPercent, period);
            System.out.println("Ежемесячный платеж: " + monthsPayment);
    }
}
