package org.lindl.conf;

import net.sf.ehcache.constructs.web.filter.GzipFilter;
import net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter;
//import org.lindl.filter.TestFilter;
import org.lindl.filter.PageFilter;
import org.lindl.filter.WebSiteMeshFilter;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lin on 2017/1/29.
 */
@Configuration
public class FilterConfig {
    /**
     * 配置ehcache的Gzip压缩
     * @return
     */
    /*
    @Bean
    public FilterRegistrationBean gzipFilter(){
        FilterRegistrationBean gzipFilter = new FilterRegistrationBean(new GzipFilter());
        String[] arrs = {"*.js","*.css","*.json","*.html"};
        gzipFilter.setUrlPatterns(Arrays.asList(arrs));
        return gzipFilter;
    }
    */
    /**
     * 配置页面缓存,页面缓存会自动开启GZIP压缩
     */
    /*
    @Bean
    public FilterRegistrationBean helloFilter(){
        FilterRegistrationBean helloFilter = new FilterRegistrationBean(new SimplePageCachingFilter());
        Map<String,String> maps = new HashMap<String,String>();
        //设置参数
        maps.put("cacheName","hello");
        helloFilter.setInitParameters(maps);
        //设置路径
        String[] arrs = {"/hello"};
        helloFilter.setUrlPatterns(Arrays.asList(arrs));
        return helloFilter;
    }
    */
    /*
    @Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new TestFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("testFilter");
        registration.setOrder(1);
        return registration;
    }
    */

    /*
    @Bean
    public FilterRegistrationBean pageFilterRegistration(){
        FilterRegistrationBean registration=new FilterRegistrationBean();
        registration.setFilter(new PageFilter());
        registration.addUrlPatterns("/app/*");
        registration.setName("sitemesh");
        return registration;
    }
    */
    /*
    @Bean
    public FilterRegistrationBean pageFilterRegistration(){
        FilterRegistrationBean registration=new FilterRegistrationBean();
        registration.setFilter(new PageFilter());
        registration.addUrlPatterns("/app/*");
        registration.setName("sitemesh");
        return registration;
    }
    */
//    @Bean
//    public FilterRegistrationBean siteMeshFilter(){
//        FilterRegistrationBean filter=new FilterRegistrationBean();
//        WebSiteMeshFilter siteMeshFilter=new WebSiteMeshFilter();
//        filter.setFilter(siteMeshFilter);
//        return filter;
//    }
}