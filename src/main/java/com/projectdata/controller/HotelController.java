package com.projectdata.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectdata.model.Hotel;
import com.projectdata.repository.HotelRepository;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	private HotelRepository hotelRepository;
	
	public HotelController(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	
	@GetMapping("/all")
	public List<Hotel> getAll(){
		List<Hotel> hotels = hotelRepository.findAll();
		return hotels;
	}
}
