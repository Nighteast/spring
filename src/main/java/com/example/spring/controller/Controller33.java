package com.example.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("main33")
public class Controller33 {

    @GetMapping("sub1")
    public void method1() {
    }

    @PostMapping("sub2")
    public void method2(String name, Integer age, MultipartFile myFile) throws IOException {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        if (myFile != null) {
            String fileName = myFile.getOriginalFilename();
            System.out.println("fileName = " + fileName);
            InputStream inputStream = myFile.getInputStream();

            String path = "C:\\Temp\\upload_" + fileName;
            FileOutputStream outputStream = new FileOutputStream(path);

            BufferedInputStream bis = new BufferedInputStream(inputStream);
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);

            try (bos; bis; inputStream; outputStream) {
                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }

    @GetMapping("sub3")
    public void method3() {

    }

    // post /main33/sub4
    @PostMapping("sub4")
    public void method4(MultipartFile upload) throws IOException {
        // 업로드한 파일을 C:\\Temp\\ 폴더내에 저장하기
        if (upload != null) {
            String fileName = upload.getOriginalFilename();
            System.out.println("fileName = " + fileName);

            String path = "C:\\Temp\\upload_" + fileName;

            InputStream is = upload.getInputStream();
            FileOutputStream fos = new FileOutputStream(path);

            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (bos; bis; fos; is) {
                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) == -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }
}
