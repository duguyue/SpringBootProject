//package org.lindl.controller;
//
//import org.lindl.entity.DemoEntity;
//import org.lindl.service.UserService;
//import org.lindl.utils.RedisClient;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// * Created by lin on 2017/1/29.
// */
//@Controller
//public class HelloController {
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
////    @Resource
////    private UserMapper userMapper;
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    public RedisClient client;
//
////    @Autowired
////    IRedisService redisService;
//
//    /**
//     * 测试hello
//     * @return
//     */
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    public @ResponseBody
//    DemoEntity hello() throws Exception {
//        DemoEntity entity = new DemoEntity();
//        entity.setId("1");
//        entity.setUsername("niuli ");
//        entity.setPassword("123456");
//        return entity;
//    }
//
//    @RequestMapping(value = "/redis",method = RequestMethod.GET)
//    public @ResponseBody String redisCache(){
//
//        client.set("jj","hdhd");
//        return "redis success";
//    }
//
//
//    @RequestMapping(value = "/users",method = RequestMethod.GET)
//    public @ResponseBody
//    User testUserDao(){
////        User user = userMapper.findById(1);
//        User user=userService.getUserById(1);
//        return user;
//    }
//
//
////    @RequestMapping(value = "/redis/set",method = RequestMethod.GET)
////    @ResponseBody
////    public User redisSet(@RequestParam("value")String value){
////        redisService.set("name", value);
////
////        User user=new User();
////        user.setUsername(value);
////        return user;
////    }
////
////    @RequestMapping(value = "/redis/get",method = RequestMethod.GET)
////    @ResponseBody
////    public User redisGet(){
////        String name = redisService.get("name");
////
////        User user=new User();
////        user.setUsername(name);
////        return user;
////    }
//
//}