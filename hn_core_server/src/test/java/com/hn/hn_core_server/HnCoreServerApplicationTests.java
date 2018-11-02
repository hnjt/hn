package com.hn.hn_core_server;

import com.hn.hn_core_server.model.TestModel;
import com.hn.hn_core_server.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HnCoreServerApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println("Test-Cheny");
    }

    @Autowired
    private TestService testImpl;

    @Test
    public void testDatasource() {

        List<TestModel> testModels = this.testImpl.testGetList();
        for (TestModel testModel : testModels) {
            System.out.println(testModel);
        }
    }
}
