package nl.novihogeschool.demo_file_upload.method3;


import nl.novihogeschool.demo_file_upload.method1.Method1File;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface Method3Service {

    Iterable<Method1File> getFiles();
    Optional<Method1File> getFileById(long id);
    boolean fileExistsById(long id);
    long uploadFile(MultipartFile file);
    void deleteFile(long id);

}