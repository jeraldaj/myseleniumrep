package testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//step 1
@RunWith(Parameterized.class)
public class LoginTest {

	//step 2 - declare global varaible
	
	String username;
	String password;
	
	// step 3 - build the constructor
	public LoginTest(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Test
	public void loginTest() {
		System.out.println(username+"----------"+password);
		
	}
	
	//step 4 create annotations
	
	@Parameters
	public static Collection<Object[]> getData(){
		
		Object[][] data = new Object[4][2];   // 4 rows - no of times tc run; 2 cols are parameters like username andpassword
		      //1st row
	        	data[0][0] = "U1";
	         	data[0][1] = "P1";
		
		        //2 row
				data[1][0] = "U2";
				data[1][1] = "P2";
				
				//3 row
				data[2][0] = "U3";
				data[2][1] = "P3";
				
				//4 row
				data[3][0] = "U4";
				data[3][1] = "P4";
		
		return Arrays.asList(data);
		
	}
	
}
