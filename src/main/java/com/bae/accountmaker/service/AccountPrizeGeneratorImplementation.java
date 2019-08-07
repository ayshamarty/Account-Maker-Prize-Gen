package com.bae.accountmaker.service;

import org.springframework.stereotype.Service;

import com.bae.accountmaker.util.Constants;

@Service
public class AccountPrizeGeneratorImplementation implements AccountPrizeGenerator {

	@Override
	public String generatePrize(String accountNumber) {
		String prize = null;
		if (accountNumber.length() == 7) {
			switch (accountNumber.charAt(0)) {
			case 'a':
				prize = Constants.LOSE;
				break;
			case 'b':
				prize = Constants.WIN_50;
				break;
			case 'c':
				prize = Constants.WIN_100;
				break;

			}
		} else if (accountNumber.length() == 9) {
			switch (accountNumber.charAt(0)) {
			case 'a':
				prize = Constants.LOSE;
				break;
			case 'b':
				prize = Constants.WIN_500;
				break;
			case 'c':
				prize = Constants.WIN_750;
				break;

			}
		} else if (accountNumber.length() == 11) {
			switch (accountNumber.charAt(0)) {
			case 'a':
				prize = Constants.LOSE;
				break;
			case 'b':
				prize = Constants.WIN_5000;
				break;
			case 'c':
				prize = Constants.WIN_10000;
				break;

			}
		} else {
			prize = Constants.LOSE;
		}
		return prize;
	}

}
