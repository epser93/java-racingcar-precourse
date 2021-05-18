package racingcar;

import domain.Car;
import java.util.List;
import java.util.Scanner;
import view.InputView;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        InputView inputview = new InputView();

        List<Car> carList = inputview.getCarNames(scanner);
    }
}
