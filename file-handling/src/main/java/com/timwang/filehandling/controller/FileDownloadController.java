package com.timwang.filehandling.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

/**
 * @ Author  : Tim Wang
 * @ FileName: FileDownloadController.java
 * @ Time    : 2020/4/4 23:57
 */
/*
* 档案下载
*   对于文件下载，应使用InputStreamResource下载文件。我们需要在Response中设置HttpHeader Content-Disposition，
*   并需要指定应用程序的响应媒体类型。
*
* */

@RestController
public class FileDownloadController {

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public ResponseEntity<Object> downloadFile() throws IOException{
        String filename = "D:\\dos\\mysql.png";
        File file = new File(filename);
        InputStreamReader resource = new InputStreamReader(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-Disposition",
                String.format("attachment: filename=\"%s\"",
                        file.getName()));

        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        ResponseEntity<Object> responseEntity;
        responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(
                MediaType.parseMediaType("application/txt")).body(resource);
        return responseEntity;
    }
}
