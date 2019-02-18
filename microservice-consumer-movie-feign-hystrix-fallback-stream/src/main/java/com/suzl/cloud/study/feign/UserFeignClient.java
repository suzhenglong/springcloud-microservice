package com.suzl.cloud.study.feign;

import com.suzl.cloud.study.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description: Feign的fallback测试
 * 使用@FeignClient的fallback属性指定回退类
 * @author: zhenglongsu@163.com
 * @date: 2018.11.08 10:59
 */
@FeignClient(name = "MICROSERVICE-PROVIDER-USER", fallback = FeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}


/**
 * @Description:回退类FeignClientFallback需实现Feign Client接口
 * * FeignClientFallback也可以是public class，没有区别
 * @author: zhenglongsu@163.com
 * @date: 2018.11.08 18:22
 */
@Component
class FeignClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }
}
