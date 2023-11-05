package server;

import sevice.CalculatriceWS;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {

        String url = "http://localhost:8084/";
        // Spécifie l'URL sur laquelle le service web sera publié
        Endpoint.publish(url, new CalculatriceWS());
        // Publie le service web en utilisant l'URL spécifiée
        System.out.println("service deployé sur " + url);
        // Affiche un message indiquant que le service web a été déployé
    }
}


