package hello.coco.ex.service;

import hello.coco.ex.model.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface BoardService {

    public List<BoardVO> boardList(BoardVO bid) throws Exception;
}
