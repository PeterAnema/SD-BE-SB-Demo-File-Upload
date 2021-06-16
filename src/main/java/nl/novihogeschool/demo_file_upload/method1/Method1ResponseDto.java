package nl.novihogeschool.demo_file_upload.method1;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import java.util.Date;

@Data
public class Method1ResponseDto {
        private String title;
        private String description;
        private String fileName;
        private String mediaType;
        private String downloadUri;
}
