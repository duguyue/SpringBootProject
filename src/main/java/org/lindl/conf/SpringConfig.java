//package org.lindl.conf;
//
//import org.lindl.utils.SpringUtil;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.thymeleaf.spring4.SpringTemplateEngine;
//import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring4.view.ThymeleafViewResolver;
//import org.thymeleaf.templateresolver.TemplateResolver;
//import org.thymeleaf.util.TemplateModeUtils;
//
///**
// * Created by lin on 2017/1/30.
// */
//@Configuration
//public class SpringConfig {
//
//    @Bean
//    public SpringResourceTemplateResolver templateResolver(){
//        SpringResourceTemplateResolver templateResolver=new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(SpringUtil.getApplicationContext());
//        templateResolver.setPrefix("/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode("HTML");
//        templateResolver.setCacheable(true);
//        return templateResolver;
//    }
//    @Bean
//    public SpringTemplateEngine templateEngine(){
//        SpringTemplateEngine templateEngine=new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        return templateEngine;
//    }
//    @Bean
//    public ThymeleafViewResolver viewResolver(){
//        ThymeleafViewResolver viewResolver=new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setOrder(1);
//        viewResolver.setViewNames(new String[]{".html",".xhtml"});
//        return viewResolver;
//    }
//}
