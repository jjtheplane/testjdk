
    Feature: Tests the customer-information microservice
    Background:
        * url urls['client_information']
        * def pathPom = 'v2/pom/people/'

#        Schema
        * def OkResponseSchema = { meta: '#(metadataSchemaOk)', data: '#[] okSchema', errors: []}
        * def metadataSchemaOk = {method: '#present', operation: '#present', paging: '#present'}
        * def okSchema = { id_host: '#present', id_pom_persona: '#present', go_user_number: '#present', name: '#present', lastname: '#present', gender: '#present', birth_date: '#present', cuit: '#present', documents: '#present', employee_BGBA_code: '#present', address: '#present', phones: '#present', emails: '#present', segment_code: '#present', main_location: '#present', company_list: '#present', id_adhesion: '#present', IVA_condition_code: '#present' }

        * def metadataSchemaError = {method: '#string', operation: '#string'}
        * def errorSchema = { code: '#string', detail: '#string'}
        * def ErrorResponseSchema = { meta: '#(metadataSchemaError)', data: [], errors: '#[] errorSchema'}

        * def id_host = '1400'
        * def id_hostNExist = '9800002'

    @local @dev @int @qas
    Scenario: tests that the ok structure is correct
        Given path pathPom,'host',id_host,'data'
        And header id_channel = channelToInsert
        When method get
        Then status 200
        And match response == OkResponseSchema

    @local @dev @int @qas
    Scenario: tests that the ok structure is incorrect when id_host dont exists
        Given path pathPom,'host',id_hostNExist,'data'
        And header id_channel = channelToInsert
        When method get
        Then status 400
        And match response == ErrorResponseSchema