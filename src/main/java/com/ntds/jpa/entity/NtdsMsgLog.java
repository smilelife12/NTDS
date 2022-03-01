package com.ntds.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "NTDS_msg_log")
public class NtdsMsgLog {
    @Id
    @Column(name = "msg_code", nullable = false, length = 128)
    private String msgCode;

    @ManyToOne(optional = false)
    @JoinColumn(name = "page_code", nullable = false)
    private NtdsPageData pageCode;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_code", nullable = false)
    private NtdsUser userCode;

    @Column(name = "msg_data", nullable = false, length = 256)
    private String msgData;
}