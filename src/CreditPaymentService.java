public class CreditPaymentService {
    public int calculate (int creditSum, double yearsPercent, int period) {
        double monthPercent = yearsPercent / 12;
        int monthPayment = (int) (creditSum * ((monthPercent * Math.pow(1 + monthPercent, period * 12))
                                                        / (Math.pow(1 + monthPercent, period * 12) - 1)));

        return monthPayment;
    }

}
