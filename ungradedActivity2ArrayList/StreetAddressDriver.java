package ungradedActivity2ArrayList;

import java.util.ArrayList;

/**
 * Java Course 3, Module 2 - Ungraded Activity 2
 * 
 * ArrayList
 *
 * @author John Josue Vendanillo
 * 
 * this program display the street addresses that added on the ArrayList via for-each loop
 */

public class StreetAddressDriver {

	public static void main(String[] args) {
			
		
		ArrayList<String> addressList  = new ArrayList<String>();
		
		addressList.add("1600 Pennsylvania Avenue"); 
		addressList.add("221B Baker Street");
		addressList.add("8700 N.W. River Park Drive");
		
		for (String address : addressList) {
			System.out.println(address);
		}
	}

}
