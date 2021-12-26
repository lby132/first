package hello.coco.ex;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "classpath:application.yml")
@Slf4j
public class MySqlConnectionTest {

    @Autowired
    private DataSource ds;

    @Test
    public void testConnection() {
        try(Connection con = ds.getConnection()){
            log.info(con + " = 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}