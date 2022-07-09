package com.code.dreamer.commerce2.files;

import java.nio.file.Path;

public interface FileStorageHelper {

    Path createPath(String path);

    Path createDirectory(String name);

    Path getDefaultPath();

    Path getDefaultDirectory();
}
