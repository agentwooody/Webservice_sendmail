package javatest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface emailinterface {
    @WebMethod
    public void SendEmail(@WebParam(name = "url") List<String> url, @WebParam(name = "payload") String payload);
    @WebMethod
    public boolean checkEmail(@WebParam(name = "url") String email);

}
