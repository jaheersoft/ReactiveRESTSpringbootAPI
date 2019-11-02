package com.jaheer.reactive.webdto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddBookWebRequest {
    private String title;
    private String authorId;
}
