package com.haku.springdata.springdata01.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String uname;
    private String upass;

    public User(String uname, String upass) {
        this.uname = uname;
        this.upass = upass;
    }
}
