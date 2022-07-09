package com.code.dreamer.commerce2.storage;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
public class FileStorageServiceImpl implements FileStorageService {
    @Override
    public String saveTempFile(MultipartFile file) {
        return UUID.randomUUID().toString();
    }
}
