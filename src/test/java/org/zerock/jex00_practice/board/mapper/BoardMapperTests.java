package org.zerock.jex00_practice.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.jex00_practice.board.config.BoardRootConfig;
import org.zerock.jex00_practice.board.domain.Board;
import org.zerock.jex00_practice.common.config.RootConfig;

import java.util.stream.IntStream;

@Log4j2
@ExtendWith(SpringExtension.class) //ExtendWith – 해당코드가 스프링 실행 역할을 알려줌 -> 스프링한테 나 이거 테스트할거야!알려줌
@ContextConfiguration(classes = {BoardRootConfig.class, RootConfig.class}) //Contex~ 지정된 클래스나, 문자열을 이용해서 필요한 객체 등록
public class BoardMapperTests {


    @Autowired
    BoardMapper boardMapper;

    @Test
    public void testDummies() {

        IntStream.rangeClosed(1,100).forEach(i -> {
            Board board = Board.builder()
                    .title("title" + i)
                    .content("content" + i)
                    .writer("user" + (i % 10))
                    .build();
            boardMapper.insert(board);
        });

    }

}
