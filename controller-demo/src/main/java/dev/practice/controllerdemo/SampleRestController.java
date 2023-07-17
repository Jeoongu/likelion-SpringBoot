package dev.practice.controllerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController //데이터를 주고받는 것에 주력, 간단하게 말하자면 Controller + ResponseBody
@RequestMapping("/rest") //prefix mapping, 앞에 붙일 path경로 설정
public class SampleRestController {
    private static final Logger logger = LoggerFactory.getLogger(SampleRestController.class);

    @GetMapping("/sample-payload")
    public SamplePayload samplePayload(){
        return new SamplePayload("aledma", 10, "Developer");
    }

    @GetMapping(
            value = "/sample-image",
            produces = MediaType.IMAGE_PNG_VALUE
    )
    public byte[] sampleImage() throws IOException{ // byte, InputStream
        InputStream inputStream = getClass().getResourceAsStream("/static/img.png");

        return inputStream.readAllBytes();
    }

}
