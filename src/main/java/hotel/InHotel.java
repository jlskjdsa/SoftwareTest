package hotel;

public class InHotel extends Empty {
    public String in(int roomNo, String name) {
        MainRun mr = new MainRun();
        int room = (roomNo % 100) - 1;
        if (isEmpty(roomNo)) {
            mr.getRoom()[(roomNo / 100) - 1][room] = name;
            return name + "成功入住" + roomNo + "房间!";
        } else {
            return "该房间已经有客人入住!";
        }
    }

    @Override
    public boolean isEmpty(int roomNo) {
        String room = mr.getRoom()[(roomNo / 100) - 1][(roomNo % 100) - 1];
        return "EMPTY".equals(room);
    }
}