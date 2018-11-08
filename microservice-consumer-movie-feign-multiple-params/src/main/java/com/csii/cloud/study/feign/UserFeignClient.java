package com.csii.cloud.study.feign;

import com.csii.cloud.config.FeignLogConfiguration;
import com.csii.cloud.study.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Description:
 * @author: zhenglongsu@163.com
 * @date: 2018.11.08 10:59
 */
//@FeignClient(name = "MICROSERVICE-PROVIDER-USER",configuration = FeignLogConfiguration.class)
@FeignClient(name = "MICROSERVICE-PROVIDER-USER-MULTIPLE-PARAMS")
public interface UserFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    /**
     * 该请求不会成功
     * @param user
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get0(User user);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get1(@RequestParam("id") Long id, @RequestParam("username") String username);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get2(@RequestParam Map<String, Object> map);

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public User post(@RequestBody User user);
}
