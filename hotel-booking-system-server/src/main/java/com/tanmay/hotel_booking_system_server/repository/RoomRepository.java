package com.tanmay.hotel_booking_system_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanmay.hotel_booking_system_server.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {


}
