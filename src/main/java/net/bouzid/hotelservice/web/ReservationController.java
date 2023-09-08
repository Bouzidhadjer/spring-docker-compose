package net.bouzid.hotelservice.web;

import lombok.AllArgsConstructor;
import net.bouzid.hotelservice.entities.Reservation;
import net.bouzid.hotelservice.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
        private ReservationRepository reservationRepository;

        @GetMapping("/reservations")
         public List<Reservation> reservationList(){
             return reservationRepository.findAll();
         }

}
