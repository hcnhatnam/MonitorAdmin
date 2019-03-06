package com.monitor.admin.test;

import com.monitor.admin.DBEntities.ImagesImpl;
import com.monitor.admin.config.MainAppConfig;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Test
	public void contextLoads() {
		assertNotNull(MainAppConfig.INSTANCE.model.getTableImage());
	}

}
