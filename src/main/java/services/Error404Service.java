package services;

import api.model.workspaces.Error404Response;
import com.crowdar.api.rest.Response;

public class Error404Service extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, Error404Response.class,setParams());
    }
}
