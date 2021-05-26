package testcases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ShopMobilePhoneTest {

	
	@Test
	
	public void test_a_searchMobile() {
		System.out.println("Searching for Mobile");
	}
	
//	@Ignore      *skips test
    @Test
	
	public void test_b_chooseMobile() {
		Assume.assumeTrue(false); //skip test progmatically
		System.out.println("Choosing Mobile");
	}
    
   @Test
	
	public void test_c_buyMobile() {
		System.out.println("buying Mobile");
	}
}
