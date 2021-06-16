package nl.novihogeschool.demo_file_upload.method3;

import nl.novihogeschool.demo_file_upload.exceptions.RecordNotFoundException;
import nl.novihogeschool.demo_file_upload.method1.Method1File;
import nl.novihogeschool.demo_file_upload.method1.Method1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class Method3ServiceImpl implements Method3Service {

    @Autowired
    private Method1Repository repository;

    @Override
    public Iterable<Method1File> getFiles() {
        return repository.findAll();
    }

    @Override
    public long uploadFile(MultipartFile file) {
//        Method3File newFile = repository.save(file);
//        return newFile.getId();
        return 0L;
    }

    @Override
    public void deleteFile(long id) {
        if (!repository.existsById(id)) throw new RecordNotFoundException();
        repository.deleteById(id);
    }

    @Override
    public Optional<Method1File> getFileById(long id) {
        if (!repository.existsById(id)) throw new RecordNotFoundException();
        return repository.findById(id);
    }

    @Override
    public boolean fileExistsById(long id) {
        return repository.existsById(id);
    }

}