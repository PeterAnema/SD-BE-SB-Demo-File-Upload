package nl.novihogeschool.demo_file_upload.method2;


import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface Method2Service {

    Iterable<Method2File> getFiles();
    Optional<Method2File> getFileById(long id);
    boolean fileExistsById(long id);
    long uploadFile(MultipartFile file);
    void deleteFile(long id);

}