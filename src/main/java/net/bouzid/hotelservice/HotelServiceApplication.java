package net.bouzid.hotelservice;

import net.bouzid.hotelservice.entities.Reservation;
import net.bouzid.hotelservice.entities.ReservationStatus;
import net.bouzid.hotelservice.repository.ReservationRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner run(ReservationRepository reservationRepository) {
		return args -> {
			reservationRepository.save(Reservation.builder().title("RES 1").price(1200).status(ReservationStatus.CREATED).build());
			reservationRepository.save(Reservation.builder().title("RES 2").price(2300).status(ReservationStatus.CONFIRMED).build());
			reservationRepository.save(Reservation.builder().title("RES 3").price(312).status(ReservationStatus.CANCELED).build());
		};
	}
}
