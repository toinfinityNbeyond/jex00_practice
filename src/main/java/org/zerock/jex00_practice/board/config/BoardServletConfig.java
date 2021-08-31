package org.zerock.jex00_practice.board.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan(basePackages = "org.zerock.jex00_practice.board.controller")
public class BoardServletConfig implements WebMvcConfigurer {

}
