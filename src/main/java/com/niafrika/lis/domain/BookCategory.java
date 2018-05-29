package com.niafrika.lis.domain;

import javax.persistence.*;

@Entity
public class BookCategory {
    //  - REF = reference books,such as dictionaries, etc.
    // - MTB = manuals, textbooks, handbooks, etc.
    // - SM= scientific monographs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(nullable = true)
    private String description;

    @Version
    private Integer version;

    @OneToOne(mappedBy = "bookCategory", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Book book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
