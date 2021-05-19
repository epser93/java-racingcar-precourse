package view;

import domain.Car;
import domain.GameSystem;
import java.util.List;

public class OutputView {

    public static void printResultOne(Car car) {
        System.out.println(car.getName() + ": " + car.getDashPosition());
    }

    public static void printWinner(String winners) {
        System.out.println("최종 우승자 : " + winners);
    }
}