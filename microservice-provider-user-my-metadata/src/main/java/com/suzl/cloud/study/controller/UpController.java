package com.suzl.cloud.study.controller;

import com.suzl.cloud.study.checker.MyHealthChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: zhenglongsu@163.com
 * @date: 2018.11.07 15:37
 */

@RestController
public class UpController {

    @Autowired
    MyHealthChecker myHealthChecker;

    @RequestMapping("/up")
    public String up(@RequestParam("up") Boolean up) {
        myHealthChecker.setUp(up);

        return up.toString();
    }

}