package hello.coco.ex.service;

import hello.coco.ex.dao.MemberDAO;
import hello.coco.ex.model.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public List<MemberVO> MemberInfo(String id) throws Exception {
        return memberDAO.MemberInfo(id);
    }

    @Override
    public int loginMember(MemberVO memberVO) throws Exception {
        return memberDAO.loginMember(memberVO);
    }

}
