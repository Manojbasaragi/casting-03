package com.manoj.Object.boot;

import com.manoj.Object.app.Logo;

public class LogoRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LogoRunner");
		
		Logo logo = new Logo("Techtron Solution", "Manoj", "Red", true, "Peocock");
        System.out.println(logo);
        
        Logo logo1 = new Logo("GloboTech Industries", "Bharat", "Blue", true, "Lion");
        System.out.println(logo1);
        
        Logo logo2 = new Logo("Dennies art", "Krishna", "Violet", false, "Cat");
        System.out.println(logo2);
	}

}
