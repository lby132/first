package hello.coco.ex.dao;

import hello.coco.ex.model.MemberVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberDAO {

    @Select("SELECT id,pw FROM TEST WHERE ID = #{id}")
    public List<MemberVO> MemberInfo(String id) throws Exception;

    @Insert("INSERT INTO TEST VALUES(#{id}, #{pw})")
    public int loginMember(MemberVO memberVO) throws Exception;
}

