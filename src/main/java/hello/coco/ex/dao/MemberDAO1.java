//package hello.coco.ex.dao;
//
//import hello.coco.ex.model.MemberVO;
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class MemberDAO1 {
//
//    @Autowired
//    private SqlSession sqlsession;
//
//    public List<MemberVO> MemberInfo(MemberVO memberVO) throws Exception {
//        return sqlsession.selectList("hello.coco.ex.boardMapper.selectTest", memberVO);
//    }
//
//    public int loginMember(MemberVO memberVO) throws Exception {
//        return sqlsession.insert("hello.coco.ex.boardMapper.selectTest.loginMember", memberVO);
//    }
//}
