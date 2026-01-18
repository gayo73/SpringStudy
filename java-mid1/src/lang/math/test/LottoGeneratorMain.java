package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generateLotto();

        System.out.print("로또 번호 : ");
        for(int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
