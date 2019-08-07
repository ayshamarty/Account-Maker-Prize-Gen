package com.bae.accountmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.accountmaker.service.AccountPrizeGenerator;

@RestController
public class AccountPrizeController {

	public AccountPrizeController() {
	}

	public AccountPrizeGenerator service;

	@Autowired
	public AccountPrizeController(AccountPrizeGenerator service) {
		this.service = service;
	}

	@GetMapping("/getPrize/{accountNumber}")
	public String getPrize(@PathVariable String accountNumber) {
		return service.generatePrize(accountNumber);
	}
}
