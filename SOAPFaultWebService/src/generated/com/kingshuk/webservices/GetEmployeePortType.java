package com.kingshuk.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-24T10:11:47.397-06:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://webservices.kingshuk.com", name = "getEmployeePortType")
@XmlSeeAlso({com.kingshuk.webservices.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetEmployeePortType {

    @WebMethod(action = "getEmployeeAction")
    @WebResult(name = "employeeResponse", targetNamespace = "http://webservices.kingshuk.com/types", partName = "parameters")
    public com.kingshuk.webservices.types.EmployeeResponse getEmployeeOperation(
        @WebParam(partName = "parameters", name = "theRequest", targetNamespace = "http://webservices.kingshuk.com/types")
        com.kingshuk.webservices.types.EmployeeRequest parameters
    ) throws SchemaValidationExceptionMessage;
}
