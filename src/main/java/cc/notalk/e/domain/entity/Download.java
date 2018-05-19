package cc.notalk.e.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "download")
public class Download implements Serializable {

    private static final long serialVersionUID = -7330960110423663686L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "userid")
    private String userId;//用户id,
    @Column(name = "bookid")
    private String bookId;//图书id,
    @Column(name = "download_time")
    private Date downloadTime;//下载时间,

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }
}
