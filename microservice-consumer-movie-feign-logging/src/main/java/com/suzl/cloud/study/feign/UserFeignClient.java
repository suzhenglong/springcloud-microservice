package com.suzl.cloud.study.feign;

import com.suzl.cloud.study.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @author: zhenglongsu@163.com
 * @date: 2018.11.08 10:59
 */
//@FeignClient(name = "MICROSERVICE-PROVIDER-USER",configuration = FeignLogConfiguration.class)
@FeignClient(name = "MICROSERVICE-PROVIDER-USER")
public interface UserFeignClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);
}
