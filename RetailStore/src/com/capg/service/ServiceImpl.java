package com.capg.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.beans.Product;
import com.capg.beans.ProductType;
import com.capg.beans.User;
import com.capg.beans.UserType;

public class ServiceImpl implements IService{

	@Override
	public double calculateBill(User user) {
		double finalAmt=0.0;
		double grocProdAmt=0.0,nonGrocAmt=0.0;
		
		
		for(Product p : user.getProducts()) {
			if(p.getProdType()==ProductType.GROCERIS) {
				grocProdAmt += p.getAmount()*p.getQuantity();
				
			}
			else {
				nonGrocAmt += p.getAmount()*p.getQuantity();	
			}
		}
		//System.out.println(grocProdAmt);System.out.println(nonGrocAmt);
		if(user.getUserType()==UserType.EMPLOYEE) {
			nonGrocAmt -= nonGrocAmt*0.3;
			finalAmt = nonGrocAmt;
			finalAmt += grocProdAmt;
		}else if(user.getUserType()==UserType.AFFILIATE) {
			nonGrocAmt -= nonGrocAmt*0.1;
			finalAmt = nonGrocAmt;
			finalAmt += grocProdAmt;
		}else {
			LocalDate regDate = LocalDate.parse(user.getRegister_date());
			if(LocalDate.now().getYear()-regDate.getYear()>=2) {
				nonGrocAmt -= nonGrocAmt*0.05;
				finalAmt = nonGrocAmt;
				finalAmt += grocProdAmt;
			}
			else {
				finalAmt = grocProdAmt+nonGrocAmt;
			}
		}
		
		int c = (int) finalAmt / 100;
		finalAmt -= c*5;
		//System.out.println(finalAmt);
		return finalAmt;
	}

}
