package com.example.demo.video.mapper;

import com.example.demo.video.dto.VideoUpload;
import com.example.demo.video.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface VideoDao {
    int insertVideo(Video video);
}
