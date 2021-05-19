package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.RandomUtils;
import view.InputView;
import view.OutputView;

public class GameSystem {

    private final static int START_RANDOM_NUM = 0;
    private final static int END_RANDOM_NUM = 10;
    private final static int GO_MEASURE = 4;

    private static List<Car> makeCarList(String[] splittedCarString) {
        List<Car> carList = new ArrayList<Car>();
        for (String carName : splittedCarString) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    private static void calculatePosition(Car car) {
        if (RandomUtils.nextInt(START_RANDOM_NUM, END_RANDOM_NUM) >= GO_MEASURE) {
            car.addPosition();
        }
    }

    private static String getWinners(List<Car> carList) {
        List<String> winnerList = new ArrayList<String>();
        int maxPos = -1;
        for (Car car : carList) {
            if (car.getIntPosition() < maxPos) {
                continue;
            }
            if (car.getIntPosition() > maxPos) {
                winnerList = new ArrayList<String>();
            }
            winnerList.add(car.getName());
            maxPos = car.getIntPosition();
        }
        return String.join(", ", winnerList);
    }

    public static void play(Scanner scanner) {
        InputView inputview = new InputView();
        List<Car> carList = makeCarList(inputview.getCarNames(scanner));
        int trialCnt = inputview.getTrialCnt(scanner);
        System.out.println("실행결과");
        for (int i = 0; i < trialCnt; i++) {
            playOne(carList);
        }
        OutputView.printWinner(getWinners(carList));
    }

    private static void playOne(List<Car> carList) {
        for (Car car : carList) {
            calculatePosition(car);
            OutputView.printResultOne(car);
        }
        System.out.println();
    }
}