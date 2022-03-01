package com.ntds.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "NTDS_page_data")
public class NtdsPageData {
    @Id
    @Column(name = "page_code", nullable = false, length = 128)
    private String pageCode;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_code", nullable = false)
    private NtdsUser userCode;

    @Column(name = "page_title", length = 128)
    private String pageTitle;

    @Column(name = "page_url", nullable = false, length = 256)
    private String pageUrl;

    @Column(name = "create_time", nullable = false)
    private Long createTime;

    @Column(name = "last_update_time", nullable = false)
    private Long lastUpdateTime;
}