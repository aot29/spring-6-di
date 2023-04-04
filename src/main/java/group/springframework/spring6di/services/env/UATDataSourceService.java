package group.springframework.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class UATDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "UAT";
    }
}
