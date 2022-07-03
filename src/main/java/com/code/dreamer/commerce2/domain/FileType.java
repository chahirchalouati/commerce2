package com.code.dreamer.commerce2.domain;

/***
 * Created by Chahir Chalouati
 * in 10/14/2021
 */
public enum FileType {
    VIDEO_AMV_VALUE("video/amv"),
    VIDEO_MP4_VALUE("video/mp4"),
    VIDEO_M4V_VALUE("video/m4v"),
    VIDEO_FLV_VALUE("video/flv"),
    VIDEO_AVI_VALUE("video/avi"),
    VIDEO_3GPP_VALUE("video/3gp"),
    IMAGE_GIF_VALUE("image/gif"),
    IMAGE_JPEG_VALUE("image/jpeg"),
    IMAGE_PNG_VALUE("image/png"),
    APPLICATION_OCTET_STREAM_VALUE("application/octet-stream"),
    APPLICATION_PDF_VALUE("application/pdf");

    FileType(String s) {
    }
}
