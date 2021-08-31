package org.zerock.jex00_practice.board.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //xml으로 자바 빈을 설정하던걸 자바 코드로 만들어준다.
@MapperScan(basePackages = "org.zerock.jex00_practice.board.mapper" )
@ComponentScan(basePackages = "org.zerock.jex00_practice.board.service")
public class BoardRootConfig {
}
