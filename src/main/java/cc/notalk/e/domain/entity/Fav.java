package cc.notalk.e.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fav")
public class Fav implements Serializable {

    private static final long serialVersionUID = 3819208371769015311L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "userid")
    private String userid;
    @Column(name = "objid")
    private String objid;//图书id或者专题id
    @Column(name = "type")
    private Integer type;//类型 1.图书 2.专题

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
