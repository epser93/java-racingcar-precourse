package view;

import domain.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public List<Car> getCarNames(Scanner scanner) {
        List<Car> carList = new ArrayList();
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] cars = scanner.nextLine().split(",");
        for (String carName : cars) {
            carList.add(new Car(carName));
        };
        return carList;
    }
}
