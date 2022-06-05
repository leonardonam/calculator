package example.com.leszko.calculator.demoexample.com.leszko.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.com.leszko.calculator.demoexample.com.leszko.calculator.services.Calculator;

@RestController
public class CalculatorController {
	@Autowired
	private Calculator calculator;
	
	@RequestMapping("/sum")
	String sum (@RequestParam("a")Integer a,@RequestParam Integer b) {
		return String.valueOf(calculator.sum(0, 0));
	}
}
