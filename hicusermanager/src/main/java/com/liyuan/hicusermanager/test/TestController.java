package com.liyuan.hicusermanager.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by weiyuan on 2019/9/1/001.
 */
@RestController
public class TestController {
    @RequestMapping("testsso")
    public ModelAndView testSSo(ModelAndView modelAndView) {
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
