package com.rateExchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.rateExchange.dao.ExchangeRateDao;
import com.rateExchange.model.ExchangeRate;

@RestController
@RequestMapping("/rates")
public class ExchangeRateContoller {
	@Autowired
	private ExchangeRateDao exchangeRateDao;
	
	@PostMapping("/saveRates")
	public String saveExchangeRate(@RequestBody List<ExchangeRate> exchangeRateList) {
		exchangeRateDao.saveAll(exchangeRateList);
		return "Rates saved: " + exchangeRateList.size();
	}
	
	@GetMapping("/exchangeRates")
	public List<ExchangeRate> getExchangeRate(){
		return (List<ExchangeRate> )exchangeRateDao.findAll();
	}
}
