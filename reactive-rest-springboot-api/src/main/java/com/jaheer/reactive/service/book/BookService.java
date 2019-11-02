package com.jaheer.reactive.service.book;

import com.jaheer.reactive.servicedto.request.AddBookRequest;
import com.jaheer.reactive.servicedto.request.UpdateBookRequest;
import com.jaheer.reactive.servicedto.response.BookResponse;
import io.reactivex.Completable;
import io.reactivex.Single;

import java.util.List;

public interface BookService {
    Single<String> addBook(AddBookRequest addBookRequest);

    Completable updateBook(UpdateBookRequest updateBookRequest);

    Single<List<BookResponse>> getAllBooks(int limit, int page);

    Single<BookResponse> getBookDetail(String id);

    Completable deleteBook(String id);
}
