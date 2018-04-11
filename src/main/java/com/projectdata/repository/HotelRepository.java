package com.projectdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projectdata.model.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String>{

}
