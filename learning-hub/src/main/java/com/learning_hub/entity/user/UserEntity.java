package com.learning_hub.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "m_user", schema = "learninghub")
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    Long uId;
    @Column(name = "name",nullable = false)
    String uName;
    @Column(name = "mobile_no", nullable = false)
    String uMobileNo;

}
