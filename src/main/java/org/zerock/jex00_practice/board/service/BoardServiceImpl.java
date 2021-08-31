package org.zerock.jex00_practice.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.jex00_practice.board.domain.Board;
import org.zerock.jex00_practice.board.dto.BoardDTO;
import org.zerock.jex00_practice.board.mapper.BoardMapper;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;


    @Override
    public Long register(BoardDTO boardDTO) {

        Board board = boardDTO.getDomain();

        boardMapper.insert(board);

        return board.getBno();
    }
}
