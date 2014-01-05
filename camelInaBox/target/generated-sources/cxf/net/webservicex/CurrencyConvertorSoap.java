package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-12-30T03:12:23.325+01:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "CurrencyConvertorSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface CurrencyConvertorSoap {

    @WebResult(name = "ConversionRateResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "ConversionRate", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ConversionRate")
    @WebMethod(operationName = "ConversionRate", action = "http://www.webserviceX.NET/ConversionRate")
    @ResponseWrapper(localName = "ConversionRateResponse", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ConversionRateResponse")
    public double conversionRate(
        @WebParam(name = "FromCurrency", targetNamespace = "http://www.webserviceX.NET/")
        net.webservicex.Currency fromCurrency,
        @WebParam(name = "ToCurrency", targetNamespace = "http://www.webserviceX.NET/")
        net.webservicex.Currency toCurrency
    );
}