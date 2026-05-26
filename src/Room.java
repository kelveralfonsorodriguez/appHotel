public class Room {
    private int number;
    private int price;
    private boolean empty;

    public Room(int number, int price, boolean empty) {
        this.number = number;
        this.price = price;
        this.empty = empty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "Habitación #" + number +
                " | Precio: " + price +
                " | Disponible: " + (empty ? "Sí" : "No");
    }
}