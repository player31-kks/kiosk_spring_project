package kiosk_pjt.kiosk.reservation.service;

import kiosk_pjt.kiosk.Seat.domain.Seat;

import java.util.List;

public interface SeatService {
    void join(Seat seat);
    void leave(Seat seat);
    Seat findSeat(int num);
    Seat findSeat(String barcode);
    boolean isAvailableSeat(int num);
    List<Seat> currentSeatsList();
}
