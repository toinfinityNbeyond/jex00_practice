package org.zerock.jex00_practice.common.config;


import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.zerock.jex00_practice.common.converter.StringToLocalDateTimeConverter;

@EnableWebMvc //config 설정 포함
//<context:component-scan base-package="com.example.ex00.controller" /> //root-context.xml 설정

public class ServletConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToLocalDateTimeConverter());
    }

    //    <beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//		<beans:property name="prefix" value="/WEB-INF/views/" />
//		<beans:property name="suffix" value=".jsp" />
//	</beans:bean>
    //root-context.xml 설정

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        registry.viewResolver(bean);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        // /resources/** -> webapp resources 폴더는 spring에 영향을 주지 않음
    }

}
