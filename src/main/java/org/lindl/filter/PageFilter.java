package org.lindl.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lin on 2017/1/30.
 */
public class PageFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}

/*
public class PageFilter extends ConfigurableSiteMeshFilter{

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/app/*","/app/decorator")
                .addExcludedPath("/app/decorator")
                .addExcludedPath("plugin/*");
    }
}
*/