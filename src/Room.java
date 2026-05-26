public class Room {
    int number;
    int price;
    boolean empty;
    public Room(int number, int price, boolean empty) {
        this.number = number;
        this.price = price;
        this.empty = empty;
    }
    public void getPrice() {
        IO.println("the price of the room is " + price);
    }
    public void setPrice(int price1) {
        int price = price1;
        IO.println("the new  price of the room is " + price);
    }
    public void getNumber() {
        IO.println("the room number is: " + price);
    }
    public void setNumber(int num1) {
        int number = num1;
        IO.println("the new room number is: " + number);
    }
}
