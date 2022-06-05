package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import nam.ejemplo.oautho.models.Coupon;
import repos.CouponRepo;


@Controller
public class CouponController {
	
	@Autowired
	CouponRepo repo;
	
	  
	  
	  
	  @GetMapping("/showCreateCoupon")
	  public String createCoupon() {
		  System.out.println("create coupon");
		  return "prueba";
	  }
	  
	  @PostMapping("/createCoupon")
	  public String saveCoupon(Coupon copon) {
		  repo.save(copon);
		 return "created"; 
	  }
	  
	  @GetMapping("/showCoupons")
	  public String showCoupons() {
		  return "showcoupons";
	  }
	  @PostMapping("/getCoupon")
	  public ModelAndView getCoupon(String code) {
		  ModelAndView maw= new ModelAndView("couponDetails");
		  maw.addObject(repo.findByCode(code));
		  return maw;
		  
	  }
	  
	}//fin de clase

