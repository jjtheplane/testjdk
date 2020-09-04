package ar.com.bancogalicia.helpers;

import java.util.Arrays;
import java.util.List;

import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0.ObtenerClienteResponse;

public class Utils {

    private Utils() {
        //Utils
    }

    public static String getCacheUrlWithKey(String urlBaseCache, String cacheName, String key, String cacheUser, String cachePass){
        return urlBaseCache + cacheName + "/" + key + "?authMethod=Basic&authUsername=" + cacheUser
                + "&authPassword=" + cachePass + "&throwExceptionOnFailure=true";
    }

    public static Boolean isRetailPerson(ObtenerClienteResponse obtenerClienteResponse){
        return obtenerClienteResponse.getPersonaJuridica() == null;
    }

    public static Boolean isCorporatePerson(ObtenerClienteResponse obtenerClienteResponse){
        return obtenerClienteResponse.getPersonaFisica() == null;
    }

    public static Boolean existsPersonFromNv(ObtenerClienteResponse obtenerClienteResponse){
        return !obtenerClienteResponse.getBGBAResultadoOperacion().getSeveridad().name().equals("ERROR");
    }

    public static String getActivemqTopicComponentUrl(String activeMqTopicName){
        return CamelConstants.ACTIVEMQ_TOPIC_COMPONENT_URL + activeMqTopicName;
    }

    public static boolean validateChannelId(String ofbListChannels, String actualChannelId){
        List<String> channels = Arrays.asList(ofbListChannels.split(","));
        return channels.contains(actualChannelId.toLowerCase());
    }
}
