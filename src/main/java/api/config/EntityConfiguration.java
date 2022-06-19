package api.config;

<<<<<<< HEAD
import services.*;
=======
import services.UserService;
>>>>>>> afd9944048adacc768ac5ecf479a72b6e98b7e2b

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
<<<<<<< HEAD

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    /*
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },*/
    ERROR_404 {
        @Override
        public Class<?> getEntityService() {
            return Error404Service.class;
        }
    },

    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorService.class;
        }
=======
>>>>>>> afd9944048adacc768ac5ecf479a72b6e98b7e2b
    };

    public abstract Class<?> getEntityService();
}



