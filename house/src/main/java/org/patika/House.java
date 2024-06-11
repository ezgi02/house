package org.patika;

public class House {
    private double price;
    private double squareMeters;
    private int rooms;
    private int livingrooms;

    public House(double price, double squareMeters, int rooms, int livingrooms) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.rooms = rooms;
        this.livingrooms = livingrooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getLivingrooms() {
        return livingrooms;
    }

    public void setLivingrooms(int livingrooms) {
        this.livingrooms = livingrooms;
    }
}
