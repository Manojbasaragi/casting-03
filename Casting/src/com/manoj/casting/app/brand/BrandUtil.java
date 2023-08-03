package com.manoj.casting.app.brand;

public class BrandUtil {
	public static void run() {
		System.out.println("invoking run() in BrandUtil");

		Brand brand = new LocalBrand();
		// or Brand brand = new NationalBrand();
		// or Brand brand = new InternationalBrand();
		// or Brand brand = new DuplicateBrand();
		System.out.println(brand.isItCostly);
		brand.offer();

		if (brand instanceof LocalBrand) {
			LocalBrand localBrand = (LocalBrand) brand;
			System.out.println(localBrand.quality);
			localBrand.getBrandInfo();
		}
		if (brand instanceof NationalBrand) {
			NationalBrand nationalBrand = (NationalBrand) brand;
			System.out.println(nationalBrand.price);
			nationalBrand.isPopularInCountry();
		}
		if (brand instanceof InternationalBrand) {
			InternationalBrand internationalBrand = (InternationalBrand) brand;
			System.out.println(internationalBrand.brandName);
			internationalBrand.discount();
		}

		if (brand instanceof DuplicateBrand) {
			DuplicateBrand duplicateBrand = (DuplicateBrand) brand;
			System.out.println(duplicateBrand.originalBrand);
			duplicateBrand.returnAmount();
		}

	}
}
