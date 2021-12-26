package hello.coco.ex;

import hello.coco.ex.dao.BoardRepository;
import hello.coco.ex.model.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConnectionTests {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void 커넥션_테스트(){
        try(Connection con = sqlSessionFactory.openSession().getConnection()){
            log.info("커넥션 성공!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
