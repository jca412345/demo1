package com.example.demo.video.controller;

import com.example.demo.common.Result;
import com.example.demo.video.dto.VideoUpload;
import com.example.demo.video.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private IVideoService videoService;
    @PostMapping("/upload")
    public Result uploadVideo(@RequestBody VideoUpload videoUpload){
           return videoService.uploadVideo(videoUpload);
    }
}
