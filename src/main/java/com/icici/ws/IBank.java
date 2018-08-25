package com.icici.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * This is a SEI interface
 * 
 * @author arifk2
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface IBank {

	@WebMethod
	String getAccountBalance(@WebParam(name = "account-number") String accountNumber);

	@WebMethod
	String accountHolderName(@WebParam(name = "account-number") String accountNumber);
}
