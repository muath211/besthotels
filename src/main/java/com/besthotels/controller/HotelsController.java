package com.besthotels.controller;


import com.besthotels.dto.Hotel;
import com.besthotels.dto.QueryResult;
import com.besthotels.dto.SearchQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HotelsController {

    @PostMapping("BestHotels")
    @ResponseBody
    public QueryResult findHotels(@RequestBody SearchQuery searchQuery) {


        List<Hotel> hotels = new ArrayList<>();
        hotels.add(createDummyHotel(94.3, "Helton", "Hair dryer, Kitchen facilities, Television"));

        QueryResult result = new QueryResult();
        result.addHotels(hotels);

        return result;
    }

    private Hotel createDummyHotel(double price, String name, String roomAmenities) {
        Hotel hotel = new Hotel();
        hotel.setPrice(price);
        hotel.setName(name);
        hotel.setRate((short) 3);
        hotel.setRoomAmenities(roomAmenities);
        return hotel;
    }


}
