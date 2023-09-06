package call_api;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Call_Api {
    public static void main(String[] args) {
        try { // try catch para detectar y controlar
            //solicitar una peticion -- https://http.dog/101.json
            URL url = new URL("https://http.dog/101.json");
            //   URL url = new URL("https://dog.ceo/api/breeds/image/random");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //Abrir conexion
            connection.setRequestMethod("GET"); //metodo de peticion
            connection.connect(); //conectar

            //peticion correcta?

            int responseCode = connection.getResponseCode();
            if (responseCode != 200) { // 200 OK
                throw new RuntimeException("Ocurrio un error al conectarse a la API" + responseCode); // manejo de error
            } else {
                StringBuilder infoStringBuilder = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream()); //leer el flujo de datos la api

                while (scanner.hasNext()) {   //leo el flujo de datos de la url y acumulo
                    infoStringBuilder.append(scanner.nextLine());
                }
                scanner.close();
                System.out.println(infoStringBuilder);
            }
        }
        catch (Exception excep) {
            excep.printStackTrace();
        }


    }
}
