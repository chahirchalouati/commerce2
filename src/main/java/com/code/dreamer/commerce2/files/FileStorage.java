package com.code.dreamer.commerce2.files;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

public interface FileStorage {
    void save(MultipartFile file);

    void saveMany(List<MultipartFile> files);

    void delete(String name);

    void deleteMany(List<String> names);

    File download(String name);
}
