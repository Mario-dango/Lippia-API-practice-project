
Feature: Workspace

  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados

  @prueba
  Scenario Outline: Consulta Workspace resultado exitoso
    Given Teniendo un '<API-KEY>' valido generado
    And y un '<WorkspaceId>' asociado a la cuenta
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @Workspace
    Examples:
      | operation | entity    | jsonName     | status | API-KEY                                          | WorkspaceId              |
      | GET       | WORKSPACE | workspace/rq | 200    | ZTJhMTE0ZGEtM2Q5ZS00NmM5LThiZTQtM2QyNDI5OWQxZGQ5 | 6284193ede42d9011b509c06 |


  @prueba
  Scenario Outline: Consulta Workspace resultado fallido 401
    Given Teniendo un '<API-KEY>' invalido generado
    And y un '<WorkspaceId>' asociado a la cuenta
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>
    @Workspace
    Examples:
      | operation | entity | jsonName     | status | API-KEY                                          | WorkspaceId              | jsonResponse        |
      | GET       | ERROR  | workspace/rq | 401    | ATJhMTE0ZGEtM2Q5ZS00NmM5LThiZTQtM2QyNDI5OWQxZGQ5 | 6284193ede42d9011b509c06 | project/response401 |


  @prueba
  Scenario Outline: Consulta Project resultado erroneo, endpoint invalido.
    Given Teniendo un '<API-KEY>' valido generado
    And y un '<WorkspaceId>' asociado a la cuenta
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado

    Examples:
      | operation | entity    | jsonName             | status | API-KEY                                          | WorkspaceId              |
      | GET       | ERROR_404 | workspace/request404 | 404    | ZTJhMTE0ZGEtM2Q5ZS00NmM5LThiZTQtM2QyNDI5OWQxZGQ5 | 6284193ede42d9011b509c06 |

