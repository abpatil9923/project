package com.product;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Disabled
	@Test
	void addtest() {
		
		int expectedResult = 2;
		
		int actualResult = Calculator.add(1, 1);
		
		assertThat(expectedResult).isEqualTo(actualResult);
		
	}

}
