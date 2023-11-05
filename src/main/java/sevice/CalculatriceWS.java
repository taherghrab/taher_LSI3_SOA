package sevice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculatriceWS {
@WebMethod  // Indique qu'il s'agit d'une opération web accessible
public double somme(@WebParam double a,@WebParam double b){
    // Définit une méthode "somme" accessible via le service web
    // qui prend deux paramètres a et b
    return a+b;
}
}
