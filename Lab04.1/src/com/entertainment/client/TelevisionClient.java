package com.entertainment.client;
import java.util.HashSet;
import java.util.Set;

import static com.entertainment.DisplayType.*;

import com.entertainment.InvalidChannelException;
//import com.entertainment.DisplayType;
import com.entertainment.Television;


public class TelevisionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv1 = new Television();
		Television tv2 = new Television("RCA", 10);
		
		System.out.println(tv1);
		System.out.println(tv2);
		
		try {
			tv2.changeChannel(9);
		} catch (InvalidChannelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tv2);

		System.out.println();
		Television tvA = new Television("Sony", 50);
		Television tvB = new Television("Sony", 50);
		
		System.out.println(tvA ==tvB);
		
		System.out.println(tvA.equals(tvB));
		
		Set<Television> tvs = new HashSet<Television>();
		tvs.add(tvA);
		tvs.add(tvB);
		System.out.println(tvs.size());
		System.out.println(tvs);
		
		Television tv3 = new Television();
		System.out.println(tv3);
		Television tv4 = new Television("RCA",10);
		System.out.println("tv4: " + tv4);
//		tv4.setDisplay(DisplayType.PLASMA);
		tv4.setDisplay(PLASMA);
		
		System.out.println("tv4: " + tv4);
//		Television tv5 = new Television("Sony",50, DisplayType.LED);
		Television tv5 = new Television("Sony",50, LED);
		System.out.println("tv5: " + tv5);


		
		
//   	this doesn't work becuase it is private to entertainment package
//		Turner t = new Tuner();
	}

}
