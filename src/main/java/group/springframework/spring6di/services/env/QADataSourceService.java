package group.springframework.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QADataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "QA";
    }
}
