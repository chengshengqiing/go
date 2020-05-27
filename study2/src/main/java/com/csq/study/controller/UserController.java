package com.csq.study.controller;

import com.csq.study.pojo.Result;
import com.csq.study.pojo.StatusCode;
import com.csq.study.pojo.User;
import com.csq.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(method= RequestMethod.GET)
    public Result findAll(){
        Result result = new Result(true, StatusCode.OK,"查询成功", userService.findAll());
        return result;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Result findById(@PathVariable Integer id){
        Result result = new Result(true,StatusCode.OK,"查询成功",  userService.findById(id));
        return result;
    }

    @RequestMapping(method=RequestMethod.POST)
    public Result add(@RequestBody User user){
        userService.add(user);
        Result result = new Result(true,StatusCode.OK,"添加成功");
        return result;
    }

    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    public Result update(@RequestBody  User user,@PathVariable Integer id){
        user.setId(id);
        userService.update(user);
        Result result = new Result(true,StatusCode.OK,"修改成功");
        return result;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public Result deleteById(@PathVariable Integer id){
        userService.deteleById(id);
        Result result = new Result(true,StatusCode.OK,"删除成功");
        return result;
    }
}
