package group.springframework.spring6di.controllers.env;

import group.springframework.spring6di.services.env.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyEnvController {
    private final DataSourceService dataSourceService;

    public MyEnvController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    String getDatasource() {
        return dataSourceService.getDataSource();
    }
}
