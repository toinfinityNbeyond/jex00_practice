package org.zerock.jex00_practice.board.mapper;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.jex00_practice.board.config.BoardRootConfig;
import org.zerock.jex00_practice.common.config.RootConfig;

@Log4j2
@ExtendWith(SpringExtension.class)  // 해당코드가 스프링을 실행하고 있다고 알려주는 역할
@ContextConfiguration( classes =  {BoardRootConfig.class, RootConfig.class}) //패키지를 말고 기능에 따라서 넣어야함
                                    // 세분화한 클래스, 공통 클래스


public class TimeMapperTests {

    @Autowired //테스트 코드는 자동주입X  꼭 Autowired를 써야한다
      TimeMapper timeMapper;  //TimeMapper 주입

    @Test
    public void testGetTime () {

        log.info("-----------------------");
        log.info("-----------------------");
        log.info(timeMapper.getTime2());
        log.info("-----------------------");
        log.info("-----------------------");



    }

}
