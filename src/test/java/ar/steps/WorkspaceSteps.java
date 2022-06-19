package ar.steps;

import ar.validator.*;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import services.BaseService;

public class WorkspaceSteps extends PageSteps {

    @Given("^Teniendo un '(.*)' valido generado$")
    public void miApikeyAsociada(String apiKey) {
        BaseService.API_KEY.set(apiKey);
    }

    @Given("^Teniendo un '(.*)' invalido generado$")
    public void miApikeyInvalidoAsociada(String badApiKey) {
        BaseService.API_KEY.set(badApiKey);
    }

    @And("^y un '(.*)' asociado a la cuenta$")
    public void miWorkspaceAsociado(String workspace_Id) {
        BaseService.WORKSPACE_ID.set(workspace_Id);
    }

    @Then("Obtengo los datos de mi Workspace")
    public void obtengoLosDatosDeMiWorkspace() {
        WorkspaceValidator.validate();
    }

    @Then("se obtuvo el response esperado")
    public void seObtuvoElResponseEsperado() {
        ProjectValidators.ValidatorE_404();
    }


}
