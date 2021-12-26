package hello.coco.ex.service;

import hello.coco.ex.model.MemberVO;

import java.util.List;

public interface MemberService {

    public List<MemberVO> MemberInfo(String id) throws Exception;

    public int loginMember(MemberVO memberVO) throws Exception;
}
