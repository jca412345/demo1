package com.example.demo.video.service;


import com.example.demo.common.Result;
import com.example.demo.video.dto.VideoUpload;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;


public interface IVideoService {
    Result uploadVideo(VideoUpload videoUpload);
}
