- inputView
  - getCarNames (자동차 이름을 입력받는 메서드) [O]
  - getTrialCnt (시도 횟수를 입력받는 메서드) [X]
- outputView
  - printResult (전진결과를 출력하는 메서드) [x]
  - printWinner (최종 우승자를 출력하는 메서드) [X]

- domain
  - Car
    - getName (car 객체 이름 반환 메서드) [O]
  - System
    - getPosition (포지션을 -로 변환시키는 메서드) [X]
    - getWinner (최종 우승자를 구하는 메서드) [X]



## 배운점

1.

```java
// List 참조 X
List carList = inputview.getCarNames(scanner);
System.out.println(carList);
for (Object car : carList) {
    System.out.println(car.getName()); 
}

// List 참조
List<Car> carList = inputview.getCarNames(scanner);
System.out.println(carList);
for (Car car : carList) {
    System.out.println(car.getName());
}
```

> List<참조형>을 하지 않으면 Car객체를 참조하지 못해 getName 메서드를 사용하지 못함

