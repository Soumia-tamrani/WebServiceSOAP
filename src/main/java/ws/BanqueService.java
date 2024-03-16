package ws;

import java.util.Arrays;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

@WebService(serviceName= "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionMontantEuroToDH")
    public double conversionMontant(@WebParam (name = "montant") double mont){
        return mont*11;
    }

    public BanqueService() {
    }


    @WebMethod
    public Compte getCompteDetails(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*2001,new Date());
    }
    @WebMethod
    public List<Compte> listCpts(){
        return Arrays.asList(
                new Compte(1,2000,new Date()),
                new Compte(2,3000,new Date()),
                new Compte(3,4000,new Date())
        );
    }


}
