package vn.mihquan.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.mihquan.jobhunter.util.error.IdInvalidException;

@RestController

public class HelloController {

    @GetMapping("/")
    public String getHelloWorld() throws IdInvalidException {
        return "Hello world from Hello Controller";
    }
}
