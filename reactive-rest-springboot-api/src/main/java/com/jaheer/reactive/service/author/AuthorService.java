package com.jaheer.reactive.service.author;

import com.jaheer.reactive.servicedto.request.AddAuthorRequest;
import io.reactivex.Single;

public interface AuthorService {
    Single<String> addAuthor(AddAuthorRequest addAuthorRequest);
}
