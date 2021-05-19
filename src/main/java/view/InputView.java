package view;

import domain.Car;
import domain.GameSystem;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public String[] getCarNames(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] cars = scanner.nextLine().split(",");
        if (cars.length == 0) {
            throw new IllegalArgumentException("자동차를 제대로 입력해주세요!");
        }
        return cars;
    }

    public int getTrialCnt(Scanner scanner) {
        System.out.println("시도할 회수는 몇회인가요?");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR]: 숫자만 입력가능");
        }
    }
}
