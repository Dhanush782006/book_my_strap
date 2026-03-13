
class intializingroom {

    int roomNumber;
    String roomType;
    double pricePerNight;
    boolean isAvailable;

    public intializingroom(int roomNumber, String roomType, double pricePerNight, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    public void displayRoomDetails() {
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type   : " + roomType);
        System.out.println("Price/Night : " + pricePerNight);
        System.out.println("Available   : " + isAvailable);
        System.out.println("------------------------------");
    }
}

public class intializingroom{

    public static void main(String[] args) {

        intializingroom room1 = new intializingroom(101, "Single", 1500.0, true);
        intializingroom  room2 = new intializingroom(102, "Double", 2500.0, false);
        intializingroom room3 = new intializingroom(103, "Suite", 5000.0, true);


        room1.displayRoomDetails();
        room2.displayRoomDetails();
        room3.displayRoomDetails();
    }
}
