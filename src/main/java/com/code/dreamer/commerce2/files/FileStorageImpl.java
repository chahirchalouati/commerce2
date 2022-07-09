package com.code.dreamer.commerce2.files;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileStorageImpl implements FileStorage {

    private final FileStorageHelper fileStorageHelper;

    @Override
    public void save(MultipartFile file) {

    }

    @Override
    public void saveMany(List<MultipartFile> files) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void deleteMany(List<String> names) {

    }

    @Override
    public File download(String name) {
        return null;
    }
}
