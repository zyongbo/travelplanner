package com.travelplanner.service.impl;


import com.travelplanner.domain.City;
import com.travelplanner.repository.CityReposity;
import com.travelplanner.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityReposity cityReposity;

    @Override
    public Long saveCity(City city) {

        City cityResult = cityReposity.save(city);
        return cityResult.getId();
    }

    @Override
    public List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent) {
//        Pageable pageable = new PageRequest(pageNumber, pageSize);
//
//        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("cityname", searchContent)),
//                ScoreFunctionBuilders.weightFactorFunction(1000));

//        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
//                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("cityname", searchContent)),
//                        ScoreFunctionBuilders.weightFactorFunction(1000))
//                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("description", searchContent)),
//                        ScoreFunctionBuilders.weightFactorFunction(100));

//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withPageable(pageable)
//                .withQuery(functionScoreQueryBuilder).build();
//
//        LOGGER.info("\n searchCity(): searchContent [" + searchContent + "] \n DSL = \n " + searchQuery.getQuery().toString());
//
//        Page<City> searchPageResults = cityReposity.search(searchQuery);

//        return searchPageResults.getContent();
        return null;
    }
}