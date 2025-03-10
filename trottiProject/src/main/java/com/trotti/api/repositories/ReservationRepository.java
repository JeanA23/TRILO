package com.trotti.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trotti.api.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
