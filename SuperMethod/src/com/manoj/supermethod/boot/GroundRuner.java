package com.manoj.supermethod.boot;

import com.manoj.supermethod.app.CricketGround;

public class GroundRuner {

	public static void main(String[] args) {

    System.out.println("invoking main in GroundRunner");
    
    CricketGround cricketGround = new CricketGround();
    System.out.println(cricketGround.elevation);
    System.out.println(cricketGround.isWet);
    System.out.println(cricketGround.surfaceType);
    System.out.println(cricketGround.vegetationType);
    
    System.out.println("***************************");
    
    CricketGround cricketGround2 = new CricketGround("Sand",700,false,"Dessert");
    System.out.println(cricketGround2.elevation);
    System.out.println(cricketGround2.isWet);
    System.out.println(cricketGround2.surfaceType);
    System.out.println(cricketGround2.vegetationType);
    

	}

}
