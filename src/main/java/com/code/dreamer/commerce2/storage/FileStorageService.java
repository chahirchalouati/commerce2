package com.code.dreamer.commerce2.storage;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
    String saveTempFile(MultipartFile file);
}
