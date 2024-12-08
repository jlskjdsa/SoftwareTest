package hotel;

public class Empty {
    MainRun mr = new MainRun();

    boolean isEmpty(int roomNo) {
        return "EMPTY".equals(mr.getRoom()[(roomNo / 100) - 1][(roomNo % 100) - 1]);
    }
}