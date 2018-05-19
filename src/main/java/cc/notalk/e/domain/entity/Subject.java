package cc.notalk.e.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject implements Serializable {

    private static final long serialVersionUID = -1012272851963403228L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "subject_id")
    private String subjectId;//专题id

    @Column(name = "book_id")
    private String bookId;//图书id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

}
