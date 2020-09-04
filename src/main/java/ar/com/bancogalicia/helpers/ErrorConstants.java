package ar.com.bancogalicia.helpers;

public class ErrorConstants {

    private ErrorConstants() {
    }

    public static final String CLIENT_NOT_EXISTS_CODE = "2";
    public static final String CLIENT_NOT_EXISTS_MESSAGE = "El cliente que intenta recuperar no existe.";
    public static final String OFB_HOST_NOT_CORRECT = "Id host no se corresponde.";
    public static final String BAD_PARAMETERS = "Verifique que los parametros de entrada son los correctos.";
    public static final String INCORRECT_REQ = "Incorrect client request.";
    public static final String INVALID_FORMAT_HOST_ADHESION = "Request invalida: example-> idHost\\|idAdhesion.";
    public static final String CLIENT_WITH_NOT_DOCUMENTS = "Error al obtener documentos del cliente.";
    public static final String OFB_LOAD_USER_AGAIN = "La informacion del usuario debe ser cargada nuevamente.";
    public static final String INCORRECT_FORMAT_PARAM_HOST_ADHESION =
            "Formato de parametro incorrecto. Formato correcto: idHost|idAdhesion";
}

