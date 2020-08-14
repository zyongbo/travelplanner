package com.travelplanner.repository;

import com.travelplanner.domain.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityReposity extends ElasticsearchRepository<City, Long> {
}
