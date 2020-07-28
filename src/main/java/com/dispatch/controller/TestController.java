package com.dispatch.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author xhl
 * @Date 2020/7/27
 */
@RestController
public class TestController {

    @GetMapping("test1")
    @PreAuthorize("hasRole('admin')")
    public String test1() {
        return "test1";
    }

    @GetMapping("test2")
    @PreAuthorize("hasRole('user')")
    public String test2() {
        return "test2";
    }
}
