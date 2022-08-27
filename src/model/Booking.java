package model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;


public class Booking {
    public Booking(LocalDate checkin, LocalDate checkout, Human human, Room room) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.human = human;
        this.room = room;
    }

    public Booking() {

    }

    public long getTotalPrice(){
        long total;
        long hireDate = DAYS.between(checkin, checkout);
        int price = room.getPrice();
              total = hireDate*price;
              return total;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
        this.room.setStatus(false);
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    private LocalDate checkin;
    private LocalDate checkout;
    private Human human;
    private Room room;
}
