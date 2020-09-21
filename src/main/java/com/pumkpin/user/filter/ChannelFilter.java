package com.pumkpin.user.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @PROJECT_NAME: user
 * @DESCRIPTION:
 * @USER: huangxihuan
 * @DATE: 2020/9/21 0021 14:46
 */
@WebFilter(value = "/*",filterName = "channelFilter")
public class ChannelFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(ChannelFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("================进入过滤器======================");
    }

    @Override
    public void destroy() {

    }
}
