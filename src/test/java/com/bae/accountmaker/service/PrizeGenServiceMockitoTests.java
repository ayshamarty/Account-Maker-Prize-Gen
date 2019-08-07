package com.bae.accountmaker.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.accountmaker.util.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrizeGenServiceMockitoTests {
	@InjectMocks
	AccountPrizeGeneratorImplementation prizeGen;

	private String accountNumber;

	@Test
	public void test6CharStartA() {
		accountNumber = "a000000";
		assertEquals(Constants.LOSE, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test6CharStartB() {
		accountNumber = "b000000";
		assertEquals(Constants.WIN_50, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test6CharStartC() {
		accountNumber = "c000000";
		assertEquals(Constants.WIN_100, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test8CharStartA() {
		accountNumber = "a00000000";
		assertEquals(Constants.LOSE, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test8CharStartB() {
		accountNumber = "b00000000";
		assertEquals(Constants.WIN_500, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test8CharStartC() {
		accountNumber = "c00000000";
		assertEquals(Constants.WIN_750, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test10CharStartA() {
		accountNumber = "a0000000000";
		assertEquals(Constants.LOSE, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test10CharStartB() {
		accountNumber = "b0000000000";
		assertEquals(Constants.WIN_5000, prizeGen.generatePrize(accountNumber));
	}

	@Test
	public void test10CharStartC() {
		accountNumber = "c0000000000";
		assertEquals(Constants.WIN_10000, prizeGen.generatePrize(accountNumber));
	}

}
