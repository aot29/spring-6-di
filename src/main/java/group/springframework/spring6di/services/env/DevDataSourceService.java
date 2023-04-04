package group.springframework.spring6di.services.env;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DevDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "DEV";
    }
}
