package com.lh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LH 2446059046@qq.com on 2017/7/7.
 */
@RestController
public class HelloController {
    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String say() {
        return "hello world..." + person.getName() + ":  " + person.getAge();
    }
}
