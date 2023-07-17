package dev.practice.controllerdemo;

import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("view")
public class SampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/sample-thyme")
    public ModelAndView sampleThyme(){
        logger.info("in sample thyme");
        ModelAndView modelAndView = new ModelAndView();
        List<SamplePayload> profiles = new ArrayList<>();
        profiles.add(new SamplePayload("adam", 22, "student"));
        profiles.add(new SamplePayload("charlie", 23, "accountant"));
        profiles.add(new SamplePayload("four", 24, "developer"));

        modelAndView.addObject("profile", profiles);
        modelAndView.setViewName("view-thyme");
        return modelAndView;
    }

//    @GetMapping("/sample-jsp")
//    public String sampleJsp(Model model){
//        logger.info("in sample jsp");
//        List<SamplePayload> profiles = new ArrayList<>();
//        profiles.add(new SamplePayload("adam", 22, "student"));
//        profiles.add(new SamplePayload("charlie", 23, "accountant"));
//        profiles.add(new SamplePayload("four", 24, "developer"));
//
//        model.addAttribute("profiles", profiles);
//        return "view-jsp";
//    }

//    @RequestMapping( // 요청 방법 메소드에 따른 별로의 annotation이 존재한다. ex)PostMapping, GetMapping
//            value = "hello", // 요청 url의 path로 사용 localhost:8080/hello
//            method = RequestMethod.GET // get 요청
//    ) // 경로 설정, 어떠한 경로에 어떠한 함수가 사용될지
//    @GetMapping(
//            value = "/hello"
//    )
//    public String hello(
//            @RequestParam(name = "id", required = false, defaultValue = "") String id
//    ){
//        logger.info("Path : Hello");
//        logger.info("Query Param id : "+id);
//        return  "hello.html";
//    }
//
//    @GetMapping( // 이걸 더 권장함
//            value = "hello/{id}"
//    )
//    public String hellopath(@PathVariable("id") String id){
//        logger.info("Path variable is "+id);
//        return "/hello.html";
//    }
//
//    @GetMapping(
//            "/get-profile" //value = 과 동일, path지정해줌, localhost:8080/get-profile
//    )
//    public @ResponseBody SamplePayload getProfile(){
//        return new SamplePayload("aledma", 10, "Developer");
//    }


}
