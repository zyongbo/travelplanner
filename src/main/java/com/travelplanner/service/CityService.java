package com.travelplanner.service;

import com.travelplanner.domain.City;

import java.util.List;

public interface CityService {
    public Long saveCity(City city);
    public List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);
}
