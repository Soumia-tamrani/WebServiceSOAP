package ws;

import javax.xml.ws.Endpoint;

public class ServJws {
    public static void main(String[] args) {


    String url = "http://0.0.0.0:8070/";

    Endpoint.publish(url,new BanqueService());
        System.out.println("Web service Deploye sur l'adresse : "+url);

}
}
