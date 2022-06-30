package com.csv.reader;

public interface UpdateFileCallback {

    void onFileUpdated(String fileName, boolean isSuccess);

    void onFileUpdated(String fileName);
}
