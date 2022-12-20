package org.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class New {
	@BeforeClass
	private void Before() {
      System.out.println("appu");
	}
	@BeforeMethod
	private void bc() {
      System.out.println("tharani");
	}

}
