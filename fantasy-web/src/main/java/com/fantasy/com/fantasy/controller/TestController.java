package com.fantasy.com.fantasy.controller;

import com.fantasy.result.Result;
import com.fantasy.utils.IpUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/admin")
public class TestController {
    @RequestMapping(value = "/getIpAddress")
    public Result getIpAddress(HttpServletRequest request){
        String ipAddress = IpUtils.getIpAddress(request);
        return Result.success(ipAddress,"请求成功");
    }

}
