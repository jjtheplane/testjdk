
    Feature: Tests the customer-information microservice
    Background:
        * url urls['client_information']
        * def pathPom = 'v2/pom/people/'

#        Schema
        * def okSchema = { id_host: '#present', id_pom_persona: '#present', go_user_number: '#present', name: '#present', lastname: '#present', gender: '#present', birth_date: '#present', cuit: '#present', documents: '#present', employee_BGBA_code: '#present', address: '#present', phones: '#present', emails: '#present', segment_code: '#present', main_location: '#present', company_list: '#present', id_adhesion: '#present', IVA_condition_code: '#present' }
        * def OkResponseSchema = { meta: '#(metadataSchemaOk)', data: '#[] okSchema', errors: []}
        * def metadataSchemaOk = {method: '#present', operation: '#present', paging: '#present'}

#        SchemaErrors
        * def metadataSchemaError = {method: '#string', operation: '#string'}
        * def errorSchema = { code: '#string', detail: '#string'}
        * def ErrorResponseSchema = { meta: '#(metadataSchemaError)', data: [], errors: '#[] errorSchema'}

        * def id_host_adhesion = '1400|06'

    @local @dev @int @qas
    Scenario: test that the structure is correct when using v2 and save var to pass it to getHost
        Given path pathPom,id_host_adhesion,'data'
        And header id_channel = channelToInsert
        When method get
        Then status 200
        And match response == OkResponseSchema
        * def id_pom = response.data[0].id_pom_persona