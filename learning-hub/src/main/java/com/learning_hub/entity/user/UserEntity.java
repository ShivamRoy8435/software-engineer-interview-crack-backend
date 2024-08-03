package com.learning_hub.entity.user;

import com.netflix.discovery.converters.Auto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "m_user")
@Setter
@Getter
public class UserEntity {
    @Id
@Column(name = "id",nullable = false)
Long uId;
@Column(name = "name",nullable = false)
String uName;
@Column(name = "mobile_no", nullable = false)
String uMobileNo;

}
