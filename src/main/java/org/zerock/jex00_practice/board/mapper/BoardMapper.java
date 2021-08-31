package org.zerock.jex00_practice.board.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestConstructor;
import org.zerock.jex00_practice.board.domain.Board;

import java.util.stream.IntStream;

public interface BoardMapper  {

    void insert(Board board);



}
