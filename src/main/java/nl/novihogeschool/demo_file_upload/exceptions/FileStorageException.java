package nl.novihogeschool.demo_file_upload.exceptions;

public class FileStorageException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String msg;

    public FileStorageException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}