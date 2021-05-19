package domain;

public class Car {

    private final String name;
    private int position = 0;

    private final static int MAX_LENGTH_OF_CAR_NAME = 5;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    // 추가 기능 구현
    public String getName() {
        return name;
    }

    public void addPosition() {
        position++;
    }

    public String getDashPosition() {
        StringBuilder pos = new StringBuilder();
        for (int i = 0; i < position; i++) {
            pos.append("-");
        }
        return pos.toString();
    }

    public int getIntPosition() {
        return position;
    }

    public void validateName(String carName) {
        if (carName.length() == 0) {
            throw new IllegalArgumentException("[ERROR]: 길이가 0인 이름은 불가");
        }
        else if (carName.length() > MAX_LENGTH_OF_CAR_NAME) {
            throw new IllegalArgumentException("[ERROR]: 길이가 5이상인 이름은 불가");
        }
        else if (carName == null) {
            throw new IllegalArgumentException("[ERROR]: 자동차를 제대로 입력해주세요");
        }
    }
}
