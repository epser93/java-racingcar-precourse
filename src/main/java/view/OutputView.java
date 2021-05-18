package view;

import domain.Car;
import domain.GameSystem;
import java.util.List;

public class OutputView {

    public void printResult(List<Car> carList, int trialCnt) {
        System.out.println("실행 결과");
        for (int i = 0; i < trialCnt; i++) {
            printResultOne(carList);
        }
        System.out.println("최종 우승자 : " + GameSystem.getWinners(carList));
    }

    public void printResultOne(List<Car> carList) {
        for (Car car : carList) {
            GameSystem.calculatePosition(car);
            System.out.println(car.getName() + ": " + car.getDashPosition());
        }
        System.out.println();
    }
}