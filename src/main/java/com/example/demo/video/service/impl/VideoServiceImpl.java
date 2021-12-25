package com.example.demo.video.service.impl;

import com.example.demo.common.Result;
import com.example.demo.video.dto.VideoUpload;
import com.example.demo.video.entity.Video;
import com.example.demo.video.mapper.VideoDao;
import com.example.demo.video.service.IVideoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 视频相关的service
 */
@Service
public class VideoServiceImpl implements IVideoService {
    @Autowired
    private VideoDao videoDao;
    @Autowired
    private Video video;
    /**
     * 上传成功
     * @param videoUpload
     * @return
     */
    @Override
    public Result uploadVideo(VideoUpload videoUpload) {

        BeanUtils.copyProperties(videoUpload,video);
        if (videoDao.insertVideo(video)==1){
            //插入成功
            return Result.success("上传成功");
        }
        else {
            return Result.fail("上传失败");
        }
    }

}
