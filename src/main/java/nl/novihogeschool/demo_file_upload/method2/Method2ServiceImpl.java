package nl.novihogeschool.demo_file_upload.method2;

import nl.novihogeschool.demo_file_upload.exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class Method2ServiceImpl implements Method2Service {

    @Autowired
    private Method2Repository repository;

    @Override
    public Iterable<Method2File> getFiles() {
        return repository.findAll();
    }

    @Override
    public long uploadFile(MultipartFile file) {

        String originalFilename = StringUtils.cleanPath(file.getOriginalFilename());
//        Path copyLocation = Paths.get(uploadDir + File.separator + originalFilename);
//
//        try {
//            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
//        } catch (Exception e) {
//            throw new FileStorageException("Could not store file " + originalFilename + ". Please try again!");
//        }

        Method2File newFileToStore = new Method2File();
        newFileToStore.setFileName(originalFilename);
//        newFileToStore.setLocation(copyLocation.toString());

        Method2File storedFile = repository.save(newFileToStore);

        return storedFile.getId();
    }

    @Override
    public void deleteFile(long id) {
        if (!repository.existsById(id)) throw new RecordNotFoundException();
        repository.deleteById(id);
    }

    @Override
    public Optional<Method2File> getFileById(long id) {
        if (!repository.existsById(id)) throw new RecordNotFoundException();
        return repository.findById(id);
    }

    @Override
    public boolean fileExistsById(long id) {
        return repository.existsById(id);
    }

}