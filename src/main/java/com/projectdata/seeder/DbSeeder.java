package com.projectdata.seeder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.projectdata.model.Address;
import com.projectdata.model.Hotel;
import com.projectdata.model.Review;
import com.projectdata.repository.HotelRepository;

@Component
public class DbSeeder implements CommandLineRunner {

	private HotelRepository hotelRepository;
	
	public DbSeeder(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Hotel ibis = 
				new Hotel("Ibis", 130, new Address("Lisbon", "Portugal"),
				Arrays.asList(
						new Review("Danilo", 2, false), 
						new Review("Mary", 10, true)));
		
		Hotel hilton = 
				new Hotel("Hilton", 130, new Address("New York", "United States"),
				Arrays.asList(
						new Review("Martin", 2, true), 
						new Review("Ana", 10, false)));
		
		Hotel poorHotel = 
				new Hotel("Poor", 130, new Address("Madrid", "Spain"),
				new ArrayList<>());
		
		//Drop tudo
		this.hotelRepository.deleteAll();
		
		//Add hotel
		List<Hotel> hotels = Arrays.asList(ibis, hilton, poorHotel);
		this.hotelRepository.saveAll(hotels);
	}

}
