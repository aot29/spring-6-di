package group.springframework.spring6di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyEnvControllerTest {
    @Autowired
    MyEnvController myEnvController;

    @Test
    void getDataSource() {
        System.out.println(myEnvController.getDatasource());
    }
}