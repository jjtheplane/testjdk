    Feature: Tests the customer-information microservice
    Background:
        * url urls['client_information']
        * def pathPom = 'v2/pom/people/'

#        SchemaOk
        * def metadataSchemaOk = {method: '#present', operation: '#present', paging: '#present'}
        * def okSchema = { id_host: '#present', id_pom_persona: '#present', go_user_number: '#present', name: '#present', lastname: '#present', gender: '#present', birth_date: '#present', cuit: '#present', documents: '#present', employee_BGBA_code: '#present', address: '#present', phones: '#present', emails: '#present', segment_code: '#present', main_location: '#present', company_list: '#present', id_adhesion: '#present', IVA_condition_code: '#present' }
        * def OkResponseSchema = { meta: '#(metadataSchemaOk)', data: '#[] okSchema', errors: []}

#        SchemaErrors
        * def metadataSchemaError = {method: '#string', operation: '#string'}
        * def errorSchema = { code: '#string', detail: '#string'}
        * def ErrorResponseSchema = { securityMeta: '#(metadataSchemaError)', errors: '#[] errorSchema'}

#        CallToken
        * def login = call read('classpath:karate/get-token.feature')

        @local @int @qas
        Scenario: tests that the structure is correct
            Given path pathPom,'retail','data'
            And header id_channel = channelToInsert
            And header Authorization = 'Bearer ' + login.token
            When method get
            Then status 200
            And match response == OkResponseSchema

        @local @int @qas
        Scenario: tests that the response is 403 when dont receive the token
            Given path pathPom,'retail','data'
            And header id_channel = channelToInsert
            When method get
            Then status 403
            And match response == ErrorResponseSchema