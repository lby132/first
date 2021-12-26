package hello.coco.ex.service;

import hello.coco.ex.model.BoardVO;
import hello.coco.ex.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

    private SqlSession sqlSession;

    @Override
    public List<BoardVO> boardList(BoardVO bid) throws Exception {
        System.out.println("bid = " + bid);

        return sqlSession.selectList("hello.coco.ex.boardMapper.getBoardList", bid);
    }

}
