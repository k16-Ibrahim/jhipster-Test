package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.constraints.*;

public class Books implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotBlank
    @Size(min = 1, max = 50)
    private String bookName;

    @Size(max = 50)
    private String rating;

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
