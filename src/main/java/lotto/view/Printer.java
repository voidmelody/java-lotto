package lotto.view;

import lotto.Lotto;

import java.util.List;

public class Printer {

    public void printInputMoney(){
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void printNumberOfPurchasedLotto(int lottoNumber){
        System.out.println(lottoNumber +"개를 구매했습니다.");
    }

    public void printPurchasedLotto(List<Lotto> purchasedLotto){
        for(Lotto lotto : purchasedLotto){
            String message = "[";
            for(int lottoNumber : lotto.getNumbers()){
                message += (lottoNumber + ", ");
            }
            message = message.substring(0, message.length() - 1); // 마지막 공백 제거
            message += "]";
            System.out.println(message);
        }
    }

    public void printInputWinningNumbers(){
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public void printInputWinningBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
    }
}
