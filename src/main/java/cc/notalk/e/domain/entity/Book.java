package cc.notalk.e.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 426640800583430181L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "title")
    private String title;//书名
    @Column(name = "remark")
    private String remark;//简介
    @Column(name = "type")
    private Integer type;// 1直接下载 2购买下载
    @Column(name = "url")
    private String url;//下载地址
    @Column(name = "jd_url")
    private String jdUrl;//京东购买地址
    @Column(name = "score")
    private Integer score;//1完全不推荐 3 可以看看 5 值得一看 7要看几遍 9绝世好作
    @Column(name = "category_id")
    private Long categoryId;//类别id
    @Column(name = "price")
    private Double price;//购买价格
    @Column(name = "book_id")
    private String bookId;//书籍id
    @Column(name = "add_time")
    private Date addTime;// 添加时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJdUrl() {
        return jdUrl;
    }

    public void setJdUrl(String jdUrl) {
        this.jdUrl = jdUrl;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

}
