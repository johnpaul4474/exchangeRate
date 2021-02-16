package com.rateExchange.dao;

import org.springframework.data.repository.CrudRepository;

import com.rateExchange.model.ExchangeRate;

public interface ExchangeRateDao extends CrudRepository<ExchangeRate,Integer>{

}
