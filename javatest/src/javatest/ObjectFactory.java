
package javatest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the javatest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendEmailResponse_QNAME = new QName("http://javatest/", "SendEmailResponse");
    private final static QName _CheckEmailResponse_QNAME = new QName("http://javatest/", "checkEmailResponse");
    private final static QName _CheckEmail_QNAME = new QName("http://javatest/", "checkEmail");
    private final static QName _SendEmail_QNAME = new QName("http://javatest/", "SendEmail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javatest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link CheckEmailResponse }
     * 
     */
    public CheckEmailResponse createCheckEmailResponse() {
        return new CheckEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link CheckEmail }
     * 
     */
    public CheckEmail createCheckEmail() {
        return new CheckEmail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatest/", name = "SendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatest/", name = "checkEmailResponse")
    public JAXBElement<CheckEmailResponse> createCheckEmailResponse(CheckEmailResponse value) {
        return new JAXBElement<CheckEmailResponse>(_CheckEmailResponse_QNAME, CheckEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatest/", name = "checkEmail")
    public JAXBElement<CheckEmail> createCheckEmail(CheckEmail value) {
        return new JAXBElement<CheckEmail>(_CheckEmail_QNAME, CheckEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatest/", name = "SendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

}
