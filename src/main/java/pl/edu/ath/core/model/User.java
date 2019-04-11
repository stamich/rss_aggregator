package pl.edu.ath.core.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.SortedSet;

@Document
public class User {

    public enum Role{
        READER, ADMIN
    }

    @Id
    String id;

    @Field
    String nickName;

    @Field
    String email;

    @Field
    SortedSet<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SortedSet<Role> getRoles() {
        return roles;
    }

    public void setRoles(SortedSet<Role> roles) {
        this.roles = roles;
    }
}
