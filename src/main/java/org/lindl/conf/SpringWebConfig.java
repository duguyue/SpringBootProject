package org.lindl.conf;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lin on 2017/1/30.
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class SpringWebConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
    private ApplicationContext applicationContext = null;

    public SpringWebConfig(){
        super();
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/images/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/plugin/**").addResourceLocations("classpath:/plugin/");

        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
    }
//    @Bean
//    public ResourceBundleMessageSource messageSource(){
//        ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
//        messageSource.setBasename("Messages");
//        return messageSource;
//    }

//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        super.addFormatters(registry);
//        //TODO  formatter   page11
//    }
//    public variety


}
