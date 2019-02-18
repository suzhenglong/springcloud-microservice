package com.suzl.cloud.study.feign;

import com.suzl.cloud.study.user.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@FeignClient(name = "MICROSERVICE-PROVIDER-USER", fallbackFactory = FeignClientFallbackFactory.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}


/**
 * @Description:UserFeignClient 的 fallbackFactory 类，该类需实现 FallbackFactory 接口，并覆写create方法
 * @author: zhenglongsu@163.com
 * @date: 2018.11.08 18:22
 */
@Component
class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);
    @Override
    public UserFeignClient create(Throwable cause) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                // 日志最好放在各个fallback方法中，而不要直接放在create方法中。
                // 否则在引用启动时，就会打印该日志。
                // 详见https://github.com/spring-cloud/spring-cloud-netflix/issues/1471
                LOGGER.info("fallback; reason was:", cause);
                User user = new User();
                user.setId(-1L);
                user.setUsername("默认用户");
                return user;
            }
        };
    }
}
