package nl.novihogeschool.demo_file_upload.method1;

import org.springframework.core.io.Resource;

import java.util.Optional;

public interface Method1Service {

    void init();
    Iterable<Method1File> getFiles();
    Method1ResponseDto getFileById(long id);
    boolean fileExistsById(long id);
    long uploadFile(Method1RequestDto method1Dto);
    void deleteFile(long id);
    Resource downloadFile(long id);

}