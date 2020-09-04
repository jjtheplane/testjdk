# Utility feature file for getting the security token
@ignore
Feature: Get login token

  Scenario:
    Given url authController
    And path 'v1/pom/realms/protocol/openid-connect/token'
    And request { grant_type: 'password', client_id: 'string', id_host: '1400', id_adhesion: '90' }
    And header id_channel = channelToInsert
    When method post
    Then status 200
    And match $.data[0].access_token == '#notnull'
    And def token = $.data[0].access_token