package com.lee.controlleradvice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-27 11:38
 **/
@RestController
public class FileUploadController {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

    private static Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @PostMapping("/upload")

    public String upload(MultipartFile file , HttpServletRequest httpServletRequest){
        String format=sdf.format(new Date());
        String realPath=httpServletRequest.getServletContext().getRealPath("/img")+format;
        File folder=new File(realPath);
        if(!folder.exists()){
            folder.mkdirs();
        }
        String oldName=file.getOriginalFilename();
        String newName= UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder,newName));
            String url=httpServletRequest.getScheme()+"://"+httpServletRequest.getServerName()+":"+httpServletRequest.getServerPort()+"/img"+format+"/"+newName;
            return url;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return  "error";
    }

    @PostMapping("/uploads")
    public String uploads(MultipartFile[] files, HttpServletRequest httpServletRequest){
        String format=sdf.format(new Date());
        String realPath=httpServletRequest.getServletContext().getRealPath("/img")+format;
        File folder=new File(realPath);
        if(!folder.exists()){
            folder.mkdirs();
        }
        for(MultipartFile file:files) {
            String oldName = file.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
            try {
                file.transferTo(new File(folder, newName));
                String url = httpServletRequest.getScheme() + "://" + httpServletRequest.getServerName() + ":" + httpServletRequest.getServerPort() + "/img" + format + "/" + newName;
                logger.info(url);
                System.out.print(url+"\n");
                //return url;
            } catch (Exception e) {
                logger.error("error"+e.getMessage());
                return  "error";
            }
        }
        return  "success";
    }


}
