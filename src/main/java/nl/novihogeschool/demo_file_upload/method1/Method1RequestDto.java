package nl.novihogeschool.demo_file_upload.method1;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Method1RequestDto {
        private String title;
        private String description;
        private MultipartFile file;
}
