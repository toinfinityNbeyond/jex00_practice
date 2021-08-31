package org.zerock.jex00_practice.board.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.jex00_practice.board.mapper.TimeMapper;

@Service
@Log4j2
@RequiredArgsConstructor // 객체와 객체사이의 연결고리를 주는데 그게 의존성주입의 시작- 연결해주는걸 와이어라고 부른다
//알맞은 곳에 주입시켜주는 것 - 각자의 역할의 연결 -> 스프링이 해준다.-> 객체를 만들어주는거라 의존성 주입
public class TimeServiceImpl implements TimeService{  //실질적으로 구현. Impl <-  Implements를 받기 때문

    private final TimeMapper timeMapper;

    @Override
    public String getNow() {

        log.info("service................getNow()");

        return timeMapper.getTime2();
    }
}
