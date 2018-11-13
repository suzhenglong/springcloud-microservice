package com.csii.cloud.study.filters.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author: zhenglongsu@163.com
 * @date: 2018.11.13 10:02
 */

public class PreRequestLogFilter extends ZuulFilter {
    public static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);

    @Override
    public String filterType() {
        //pre 类型的过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // org.springframework.cloud.netflix.zuul.filters.pre.PreDecorationFilter 之前执行
        return FilterConstants.PRE_DECORATION_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        LOGGER.info(String.format("send %s request to %s,参数为:%s", request.getMethod(),request.getRequestURL().toString(),request.getParameterMap().toString()));
        return null;
    }
}
