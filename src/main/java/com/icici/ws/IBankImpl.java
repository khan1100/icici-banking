package com.icici.ws;

import javax.jws.WebService;

/**
 * This is the implementation class for the SEI interface, which have bussiness
 * logic
 * 
 * @author arifk2
 *
 */
@WebService(endpointInterface = "com.icici.ws.IBank")
public class IBankImpl implements IBank {

	/**
	 * This method is created to get the balance.
	 * 
	 * @param accountNumber
	 *            holds the information of the accountNumber
	 * @return
	 * 
	 */
	public String getAccountBalance(String accountNumber) {
		if (accountNumber.equals("ICICI12")) {
			return "1200.12";
		} else {
			return "Account Number Not Found.";
		}
	}

	/**
	 * This method is created to get the balance.
	 * 
	 * @param accountNumber
	 *            holds the information of the accountNumber
	 * @return
	 */
	public String accountHolderName(String accountNumber) {
		if (accountNumber.equals("ICICI12")) {
			return "Arif Khan";
		} else {
			return "Account Number not Found..";
		}
	}
}
