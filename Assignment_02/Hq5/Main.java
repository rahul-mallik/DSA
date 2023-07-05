package Hq5;
class RestaurantMeal {
    private String name;
    private double price;

    public RestaurantMeal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class HotelService {
    private String serviceName;
    private double serviceFee;
    private int roomNumber;

    public HotelService(String serviceName, double serviceFee, int roomNumber) {
        this.serviceName = serviceName;
        this.serviceFee = serviceFee;
        this.roomNumber = roomNumber;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}

class RoomServiceMeal extends RestaurantMeal {
    private HotelService hotelService;

    public RoomServiceMeal(String name, double price, int roomNumber) {
        super(name, price);
        this.hotelService = new HotelService("room service", 24.00, roomNumber);
    }

    public void display() {
        System.out.println("A \"" +getName()+"\" costing Rs. "+getPrice()+" is a \""+hotelService.getServiceName()+"\" provided to room "+ hotelService.getRoomNumber()+" for a Rs. "+hotelService.getServiceFee());
    }
}

public class Main {
    public static void main(String[] args) {
        RoomServiceMeal roomServiceMeal = new RoomServiceMeal("steak dinner", 600, 1202);
        roomServiceMeal.display();
    }
}
