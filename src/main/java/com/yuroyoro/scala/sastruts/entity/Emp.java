package com.yuroyoro.scala.sastruts.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Empエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.39", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2009/09/02 21:59:28")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 19, nullable = false, unique = true)
    public Long id;

    /** empNoプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer empNo;

    /** empNameプロパティ */
    @Column(length = 20, nullable = true, unique = false)
    public String empName;

    /** mgrIdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer mgrId;

    /** hiredateプロパティ */
    @Column(nullable = true, unique = false)
    public Date hiredate;

    /** salプロパティ */
    @Column(precision = 7, scale = 2, nullable = true, unique = false)
    public BigDecimal sal;

    /** deptIdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer deptId;

    /** versionNoプロパティ */
    @Version
    @Column(precision = 10, nullable = true, unique = false)
    public Integer versionNo;
}