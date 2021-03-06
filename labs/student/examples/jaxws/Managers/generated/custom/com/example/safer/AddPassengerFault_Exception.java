
package com.example.safer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-b02-rc1
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "addPassengerFault", targetNamespace = "urn://Traveller/")
public class AddPassengerFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AddPassengerFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public AddPassengerFault_Exception(String message, AddPassengerFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public AddPassengerFault_Exception(String message, AddPassengerFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.example.safer.AddPassengerFault
     */
    public AddPassengerFault getFaultInfo() {
        return faultInfo;
    }

}
