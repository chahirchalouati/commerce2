package com.code.dreamer.commerce2.files;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageHelperImpl implements FileStorageHelper {
    private final Path defaultDir;

    public FileStorageHelperImpl(StorageProperties storageProperties) {
        this.defaultDir = this.createDirectory(storageProperties.getDir());
    }

    @Override
    public Path createPath(String path) {
        return Paths.get(path).normalize().toAbsolutePath();
    }

    @Override
    @SneakyThrows
    public Path createDirectory(String name) {
        return Files.createDirectories(Paths.get(name).normalize().toAbsolutePath());
    }

    @Override
    public Path getDefaultPath() {
        return this.defaultDir;
    }

    @Override
    public Path getDefaultDirectory() {
        return this.defaultDir;
    }
}
