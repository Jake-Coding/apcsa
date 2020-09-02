public class classes {
    String period;
    String className;
    String RoomNum;
    classes(String period, String className, String RoomNum) {
        this.period = period;
        this.className = className;
        this.RoomNum = RoomNum;
    }
    String desc() {
        return "P"+ period+ " " + className + " in room " + RoomNum;
    }
    
}