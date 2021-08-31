package org.zerock.jex00_practice.common.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.zerock.jex00_practice.board.config.BoardRootConfig;
import org.zerock.jex00_practice.board.config.BoardServletConfig;

import javax.servlet.Filter;


@Log4j2
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        log.info("1--------------------------");
        log.info("1--------------------------");

        return new Class[]{RootConfig.class, BoardRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        log.info("2--------------------------");
        log.info("2--------------------------");


        return new Class[]{ServletConfig.class, BoardServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() { //필터의 값을 반환하도록

        CharacterEncodingFilter utf8filter = new CharacterEncodingFilter();
        utf8filter.setEncoding("UTF-8");
        utf8filter.setForceEncoding(true);

        return new Filter[]{utf8filter};

    }
}
