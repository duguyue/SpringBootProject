package org.lindl.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lin on 2017/1/30.
 */
public class TestFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("TestFilter");
    }

    @Override
    public void destroy() {

    }
}
