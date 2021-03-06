package com.studentinfoservice.student;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-01-30T12:40:47.989-06:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "StudentInfoServices", 
                  wsdlLocation = "file:/Volumes/Work/LOCAL-GIT-REPOSITORY/SOAP-WEB-SERVICES-PRACTICE/StudentInfoService/src/main/webapp/WEB-INF/wsdl/StudentsInfo.wsdl",
                  targetNamespace = "http://studentInfoService.com/Student") 
public class StudentInfoServices extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://studentInfoService.com/Student", "StudentInfoServices");
    public final static QName StudentInfoServicePort = new QName("http://studentInfoService.com/Student", "studentInfoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Volumes/Work/LOCAL-GIT-REPOSITORY/SOAP-WEB-SERVICES-PRACTICE/StudentInfoService/src/main/webapp/WEB-INF/wsdl/StudentsInfo.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StudentInfoServices.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Volumes/Work/LOCAL-GIT-REPOSITORY/SOAP-WEB-SERVICES-PRACTICE/StudentInfoService/src/main/webapp/WEB-INF/wsdl/StudentsInfo.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StudentInfoServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StudentInfoServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentInfoServices() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public StudentInfoServices(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public StudentInfoServices(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public StudentInfoServices(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns StudentInfoService
     */
    @WebEndpoint(name = "studentInfoServicePort")
    public StudentInfoService getStudentInfoServicePort() {
        return super.getPort(StudentInfoServicePort, StudentInfoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentInfoService
     */
    @WebEndpoint(name = "studentInfoServicePort")
    public StudentInfoService getStudentInfoServicePort(WebServiceFeature... features) {
        return super.getPort(StudentInfoServicePort, StudentInfoService.class, features);
    }

}
