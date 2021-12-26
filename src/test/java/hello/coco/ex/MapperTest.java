package hello.coco.ex;

import hello.coco.ex.dao.MemberDAO;
import hello.coco.ex.model.BoardVO;
import hello.coco.ex.model.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void 매퍼_테스트() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            List<MemberVO> data = sqlSession.selectList("hello.coco.ex.boardMapper.selectTest");
            log.info(String.valueOf(data));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
