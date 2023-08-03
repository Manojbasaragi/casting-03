package com.manoj.casting.boot;

import com.manoj.casting.app.brand.Brand;
import com.manoj.casting.app.brand.BrandUtil;
import com.manoj.casting.app.brand.DuplicateBrand;
import com.manoj.casting.app.brand.InternationalBrand;
import com.manoj.casting.app.brand.LocalBrand;
import com.manoj.casting.app.brand.NationalBrand;

public class BrandRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BrandRunner");

		Brand brand = new LocalBrand();
		// or Brand brand = new NationalBrand();
		// or Brand brand = new InternationalBrand();
		// or Brand brand = new DuplicateBrand();
		System.out.println(brand.isItCostly);
		brand.offer();

		LocalBrand localBrand = (LocalBrand) brand;
		// or NationalBrand nationalBrand = (NationalBrand) brand;
		// or InternationalBrand internationalBrand = (InternationalBrand)brand;
		// or DuplicateBrand duplicateBrand = (DuplicateBrand)brand;

		BrandUtil.run();

	}

}
