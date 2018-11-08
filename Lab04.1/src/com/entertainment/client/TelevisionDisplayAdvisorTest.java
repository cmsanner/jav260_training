/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.client;

import static com.entertainment.DisplayType.*;

import com.entertainment.DisplayType;
import com.entertainment.Television;
import com.entertainment.util.TelevisionDisplayAdvisor;

public class TelevisionDisplayAdvisorTest {
  
  public static void main(String[] args) {
    // NOTE: TelevisionDisplayAdvisor.check() is a static method, so it's called via the classname
    
    // TODO: pass individual instances
    TelevisionDisplayAdvisor.check(/* new Television(), new Television(), etc. */);
 //Television(String brand, int volume, DisplayType display)
//    Television tvDefault = new Television();  // invalid volume, should remain 0 (the default)
//    Television tv1 = new Television("RCA", -10);  // invalid volume, should remain 0 (the default)
//    Television tv2 = new Television("RCA", -10, PLASMA);  // invalid volume, should remain 0 (the default)
    TelevisionDisplayAdvisor.check( new Television("RCA", 10), new Television("Sony", 4, PLASMA)
    		
    		);
//    System.out.println(tvDefault);
//    System.out.println(tv1);
//    System.out.println(tv2);
    System.out.println("-----");
    
    // TODO: pass nothing
    TelevisionDisplayAdvisor.check();
    System.out.println("-----");
    
    // TODO: pass an array - would only do this if you already had one, otherwise just pass individual instances
    Television[] tvArray = { /* new Television(), new Television(), etc. */ };
    TelevisionDisplayAdvisor.check(/* pass in tvArray */);
    System.out.println("-----");
  }
}