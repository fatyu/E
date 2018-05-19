package cc.notalk.e.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    private static final long serialVersionUID = -7724659769589654252L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name")
    private String name;//类别名称
    @Column(name = "pid")
    private Long pid;//父类别id
    @Column(name = "code")
    private String code;//类别简称

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

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
