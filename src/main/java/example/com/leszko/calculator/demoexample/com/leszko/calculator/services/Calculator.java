package example.com.leszko.calculator.demoexample.com.leszko.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
	
	public int sum(int a,int b) {
		return a+b;
	}

}
