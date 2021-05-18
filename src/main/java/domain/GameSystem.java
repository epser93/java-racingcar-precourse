package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.RandomUtils;
import view.InputView;
import view.OutputView;

public class GameSystem {

    final static private int START_RANDOM_NUM = 0;
    final static private int END_RANDOM_NUM = 10;

    public static List<Car> makeCarList(String[] splittedCarString) {
        List<Car> carList = new ArrayList<Car>();
        for (String carName : splittedCarString) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    public static void calculatePosition(Car car) {
        if (RandomUtils.nextInt(START_RANDOM_NUM, END_RANDOM_NUM) >= 4) {
            car.addPosition();
        }
    }

    public static String getWinners(List<Car> carList) {
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
        OutputView outputView = new OutputView();
        List<Car> carList = inputview.getCarNames(scanner);
        int trialCnt = inputview.getTrialCnt(scanner);
        outputView.printResult(carList, trialCnt);
    }

}