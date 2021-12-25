package com.example.demo.video.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Video {
    private String id;//主建
    private String title;//视频名称
    private String cover;//封面
    private String videoFile;//视频
    private String type;//类型
    private String username;//上传人
    private Date createTime;//上传时间
}
