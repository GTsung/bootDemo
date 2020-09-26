package com.hclt.demo.pojo.chapter7.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author GTsung
 * @date 2020/9/26
 */
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("------LoginFilter的init方法------");
        System.out.println("---filterName="+ filterConfig.getFilterName() +
                "---servletContext="+filterConfig.getServletContext());
    }

    // filter与interceptor：
    // filter过滤器在拦截器执行前，当filterChain.doFilter(req, res);后才会执行拦截器
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-----filter的doFilter方法before-----");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("-----filter的doFilter方法after-----");
    }

    @Override
    public void destroy() {
        System.out.println("----filter的destroy方法------");
    }
}
