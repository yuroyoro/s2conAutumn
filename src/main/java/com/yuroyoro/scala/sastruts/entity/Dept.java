package com.yuroyoro.scala.sastruts.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Deptエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.39", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2009/09/02 21:59:28")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 19, nullable = false, unique = true)
    public Long id;

    /** deptNoプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer deptNo;

    /** deptNameプロパティ */
    @Column(length = 20, nullable = true, unique = false)
    public String deptName;

    /** locプロパティ */
    @Column(length = 20, nullable = true, unique = false)
    public String loc;

    /** versionNoプロパティ */
    @Version
    @Column(precision = 10, nullable = true, unique = false)
    public Integer versionNo;
}