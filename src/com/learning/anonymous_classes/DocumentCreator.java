package com.learning.anonymous_classes;

interface DocumentCreationService {
    void create();
}

public class DocumentCreator {

    private DocumentCreationService documentCreationService;

    public void create() {
        final int n = 10;

        new DocumentCreationService() {

            @Override
            public void create() {
                documentCreationService.create();
            }
        };
    }
}
