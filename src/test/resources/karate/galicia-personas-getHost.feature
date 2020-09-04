Feature: Tests the customer-information microservice
    Background:
        * url urls['client_information']
        * def pathPom = 'v2/pom/people/'

        * def OkResponseSchema = { meta: '#(metadataSchemaOk)', data: '#[] okSchema', errors: []}
        * def metadataSchemaOk = {method: '#present', operation: '#present', paging: '#present' }
        * def okSchema = { host: '#present' }

        * def metadataSchemaError = {method: '#string', operation: '#string'}
        * def errorSchema = { code: '#string', detail: '#string'}
        * def ErrorResponseSchema = { meta: '#(metadataSchemaError)', data: [], errors: '#[] errorSchema'}

        * def pom = call read('classpath:karate/galicia-personas-customerInfo.feature')

    @local @dev @int @qas
    Scenario: tests that the ok structure is correct
        Given path pathPom,pom.id_pom,'host'
        And header id_channel = channelToInsert
        When method get
        Then status 200
        And match response == OkResponseSchema

