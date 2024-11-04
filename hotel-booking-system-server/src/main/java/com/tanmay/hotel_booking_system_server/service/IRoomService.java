package com.tanmay.hotel_booking_system_server.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import org.springframework.web.multipart.MultipartFile;

import com.tanmay.hotel_booking_system_server.model.Room;

public interface IRoomService {

    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;
}
