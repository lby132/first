package hello.coco.ex.dao;

import hello.coco.ex.model.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface BoardRepository {

    public List<BoardVO> getBoardList();
}
