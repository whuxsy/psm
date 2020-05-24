package whu.web.psm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import whu.web.psm.pojo.User;
import whu.web.psm.service.UserService;

@RestController
@RequestMapping("/user")
@Api(value = "UserController",tags = "用户模块")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/register")
    @ApiOperation(
            value = "注册",
            notes = "输入电话和密码，返回boolean"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(value = "电话", name = "phone",paramType = "query",dataType = "String"),
            @ApiImplicitParam(value = "密码", name = "pwd",paramType = "query",dataType = "String"),
    })
    public boolean register(@RequestParam("phone") String phone,
                            @RequestParam("pwd") String pwd){
        return userService.register(phone,pwd);
    }
    
    @GetMapping(value = "/login")
    @ApiOperation(
            value = "登录",
            notes = "输入电话和密码，返回boolean"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(value = "电话", name = "phone",paramType = "query",dataType = "String"),
            @ApiImplicitParam(value = "密码", name = "pwd",paramType = "query",dataType = "String"),
    })
    public boolean login(@RequestParam("phone") String phone,
                            @RequestParam("pwd") String pwd){
        return userService.login(phone,pwd);
    }
    
    
    @GetMapping
    @ApiOperation(
            value = "获取用户信息",
            notes = "输入电话，返回用户的信息"
    )
    @ApiImplicitParam(value = "电话", name = "phone",paramType = "query",dataType = "String")
    public User getUserByPhone(@RequestParam("phone") String phone){
        return userService.getUserByPhone(phone);
    }
    
    
    
    @PutMapping
    @ApiOperation(
            value = "更新",
            notes = "输入用户，根据用户id更新用户信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(value = "电话", name = "phone",paramType = "query",dataType = "String"),
            @ApiImplicitParam(value = "密码", name = "pwd",paramType = "query",dataType = "String"),
    })
    public boolean updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    
}