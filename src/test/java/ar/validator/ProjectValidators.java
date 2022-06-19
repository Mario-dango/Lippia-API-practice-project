package ar.validator;

import api.model.workspaces.Error404Response;

import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProjectValidators {

    public static  void ValidatorE_404(){
        Error404Response response = (Error404Response) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getTimestamp());
        Assert.assertEquals(Integer.toString(response.getStatus()),"404");
        Assert.assertEquals(response.getError(),"Not Found");
        Assert.assertEquals(response.getPath(),"/v1/workspaces/6284193ede42d9011b509c06/proyectos");
    }
}
