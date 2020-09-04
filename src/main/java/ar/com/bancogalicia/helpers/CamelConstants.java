package ar.com.bancogalicia.helpers;

public class CamelConstants {

    private CamelConstants() {
    }

    public static final String CAMEL_HEADER_HTTP_RESPONSE_CODE = "CamelHttpResponseCode";

    public static final String PROPERTY_SCORING_DATA = "scoringData";
    public static final String PROPERTY_BODY_CLIENT_INFO = "BodyClientInformation";
    public static final String HTTP_PARAM_BRIDGE_ENDPOINT_TRUE = "&bridgeEndpoint=true";
    public static final String CAMEL_HEADER_HTTP_ALL = "CamelHttp*";
    public static final String PROPERTY_CUSTOM_LOG = "log";
    public static final String PROPERTY_LOGGER = "logger";
    public static final String PROPERTY_RESPONSE_META_PATH = "path";
    public static final String PROPERTY_MESSAGE = "message";
    public static final String PROPERTY_RESPONSE_META_METHOD = "method";
    public static final String PROPERTY_RESPONSE_ERROR_CODE = "code";
    public static final String PROPERTY_IS_CORPORATE = "isCorporate";
    public static final String PROPERTY_ID_POM_PERSON = "id_pom_person";
    public static final String PROPERTY_ID_HOST = "id_host";
    public static final String PROPERTY_ID_ADHESION = "id_adhesion";
    public static final String PROPERTY_CHECK_EXISTS_POM_PERSON = "existingPomPersonId";
    public static final String PROPERTY_TEMP_CLIENT_INFO = "clientInfo";
    public static final String PROPERTY_CHANNEL_FOR_REQUEST = "channelToSend";
    public static final String PROPERTY_NO_CACHE = "nocache";

    //CAMEL EXPRESSIONS
    public static final String CAMEL_EXPRESSION_GET_HEADER_HTTP_URI = "${header.CamelHttpUri}";
    public static final String CAMEL_EXPRESSION_GET_HEADER_HTTP_METHOD = "${header.CamelHttpMethod}";
    public static final String CAMEL_EXPRESSION_GET_HEADER_ID_POM_PERSON = "${header.id_pom_person}";
    public static final String CAMEL_EXPRESSION_GET_HEADER_ID_HOST_ADHESION = "${headers.id_host_adhesion}";
    public static final String CAMEL_EXPRESSION_GET_HEADER_ID = "${headers.id}";

    //CAMEL ROUTES
    public static final String CAMEL_COMPONENT_DIRECT_GET_DATA_FROM_QUERY_ADAPTER = "direct:go-to-query-adapter";
    public static final String CLIENT_INFORMATION_RESPONSE_WITH_IDPOM = "direct:clientInformationResponseWithIdPom";
    public static final String ACTIVEMQ_TOPIC_COMPONENT_URL = "activemq:topic:";
    public static final String CAMEL_COMPONENT_DIRECT_GET_ADHESION = "direct:get-adhesion";
    public static final String CAMEL_COMPONENT_DIRECT_GET_DATA_FROM_JWT = "direct:get-data-from-jwt";
    public static final String CAMEL_COMPONENT_DIRECT_CLIENT_INFO_NOT_FOUND = "direct:ClientNotFoundInCacheClientInformation";
    public static final String CAMEL_COMPONENT_DIRECT_CLIENT_NOT_FOUND_IN_CACHE_RELATION = "direct:ClientNotFoundInCacheRelation";
    public static final String CAMEL_COMPONENT_DIRECT_GET_INFO_WITH_POM = "direct:getClientInformationWithPom";
    public static final String CAMEL_COMPONENT_DIRECT_PERSON_DATA = "direct:personDataGetRoute";
    public static final String CAMEL_COMPONENT_DIRECT_GET_HOST = "direct:get-host";
    public static final String CAMEL_COMPONENT_DIRECT_GET_HOST_FROM_POM = "direct:get-host-from-pom";

    public static final String API_ROUTE_GET_DATA = "/{id}/data";
    public static final String CONTENT_TYPE_JSON_UTF8 ="application/json; charset=utf-8";
    
    public static final String CUSTOMER_INFO_V2_LOG_MESSAGE = "[CUSTOMER INFORMATION V2 - REQUEST_ID: %s, TRACE_ID: %s, HOST_ID: %s, POM_ID: %s, TIME: %s] %s";
}

