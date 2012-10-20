package com.theopentutorials.ws.calc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.6 in JDK 6 Generated
 * source version: 2.1
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://calc.ws.theopentutorials.com/")
@XmlSeeAlso({ ObjectFactory.class })
public interface Calculator {

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns int
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "add", targetNamespace = "http://calc.ws.theopentutorials.com/", className = "com.theopentutorials.ws.calc.Add")
	@ResponseWrapper(localName = "addResponse", targetNamespace = "http://calc.ws.theopentutorials.com/", className = "com.theopentutorials.ws.calc.AddResponse")
	public int add(@WebParam(name = "arg0", targetNamespace = "") int arg0,
	                @WebParam(name = "arg1", targetNamespace = "") int arg1);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns int
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "sub", targetNamespace = "http://calc.ws.theopentutorials.com/", className = "com.theopentutorials.ws.calc.Sub")
	@ResponseWrapper(localName = "subResponse", targetNamespace = "http://calc.ws.theopentutorials.com/", className = "com.theopentutorials.ws.calc.SubResponse")
	public int sub(@WebParam(name = "arg0", targetNamespace = "") int arg0,
	                @WebParam(name = "arg1", targetNamespace = "") int arg1);

}
