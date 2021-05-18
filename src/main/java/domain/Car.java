package domain;

public class Car {

    private final String name;
    private int position = 0;

    public Car(String name) {
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
        String pos = "";
        for (int i = 0; i < position; i++) {
            pos += "-";
        }
        return pos;
    }

    public int getIntPosition() {
        return position;
    }

    public static void validateName(String carName) {
        if (carName.length() == 0) {
            throw new IllegalArgumentException("[ERROR]: 길이가 0인 이름은 불가");
        }
        else if (carName.length() > 5) {
            throw new IllegalArgumentException("[ERROR]: 길이가 5이상인 이름은 불가");
        }
    }
}
