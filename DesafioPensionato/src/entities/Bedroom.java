package entities;

public class Bedroom {
    private boolean isAvailable = true;
    private final int numBedroom;
    private Client client;

    public Bedroom(int numBedroom) {
        this.numBedroom = numBedroom;
    }

    public void rentRoom(Client client) {
        this.client = client;
        this.isAvailable = false;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getNumBedroom() {
        return numBedroom;
    }

    public Client getClient() {
        return client;
    }
}
