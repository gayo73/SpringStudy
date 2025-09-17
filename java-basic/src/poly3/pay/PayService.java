package poly3.pay;

public class PayService {
    public static void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +amount);

        Pay pay = PayStore.findPay(option);
        boolean success = pay.pay(amount);

        if(success) {
            System.out.println("결제가 성공했습니다.");
        }
        else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
