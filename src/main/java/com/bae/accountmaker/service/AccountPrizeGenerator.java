package com.bae.accountmaker.service;

import org.springframework.stereotype.Service;

@Service
public interface AccountPrizeGenerator {

	String generatePrize(String accountNumber);
}
