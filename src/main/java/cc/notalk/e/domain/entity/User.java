package cc.notalk.e.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 2212264632323306286L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "userid")
    private String userid;//用户id
    @Column(name = "name")
    private String name;//用户名(登录)
    @Column(name = "password")
    private String password;//用户密码
    @Column(name = "telephone")
    private String telephone;//手机号
    @Column(name = "wxid")
    private String wxid;//微信id
    @Column(name = "email")
    private String email;//邮件地址
    @Column(name = "area_code")
    private String areaCode;//省市区
    @Column(name = "address")
    private String address;//收货地址
    @Column(name = "nickname")
    private String nickname;//用户昵称
    @Column(name = "profile_Photo")
    private String profilePhoto;//用户头像地址

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
