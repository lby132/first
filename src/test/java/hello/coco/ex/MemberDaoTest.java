package hello.coco.ex;

import hello.coco.ex.dao.MemberDAO;
import hello.coco.ex.model.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MemberDaoTest {

    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void daoTest() throws Exception{
        MemberVO memberVO = new MemberVO();
        memberVO.setId("aaa");
        memberVO.setPw("123");
        int memberInfo = memberDAO.loginMember(memberVO);
        if (memberInfo > 0) {
            log.info("성공");
        }else{
            log.info("실패");
        }
    }
}
