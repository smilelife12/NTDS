package com.ntds.jpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@lombok.Getter
@lombok.Setter
@lombok.ToString
@Entity
@Table(name = "NTDS_user")
public class NtdsUser {
    @Id
    @Column(name = "user_code", nullable = false, length = 128)
    private String userCode;

    @Column(name = "user_id", nullable = false, length = 64)
    private String userId;

    @Column(name = "user_name", length = 64)
    private String userName;

    @Column(name = "create_time")
    private Long createTime;
}