package com.xywei.springboot.practise.filter;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "pageHelpterClearFilter", urlPatterns = "/*")
public class PageHelperClearFilter implements Filter {
	private final Logger logger = LoggerFactory.getLogger(PageHelperClearFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("invoke filter: {}", Thread.currentThread().getName());
		PageHelper.clearPage();
		chain.doFilter(request, response);
	}

}
