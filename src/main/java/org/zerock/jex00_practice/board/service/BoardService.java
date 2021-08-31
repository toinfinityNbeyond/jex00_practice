package org.zerock.jex00_practice.board.service;

import org.zerock.jex00_practice.board.domain.Board;
import org.zerock.jex00_practice.board.dto.BoardDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);
}
