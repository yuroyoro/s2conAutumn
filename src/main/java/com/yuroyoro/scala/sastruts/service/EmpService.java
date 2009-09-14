package com.yuroyoro.scala.sastruts.service;

import com.yuroyoro.scala.sastruts.entity.Emp;
import java.util.List;
import javax.annotation.Generated;

import static com.yuroyoro.scala.sastruts.entity.EmpNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Emp}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.39", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2009/09/02 21:59:35")
public class EmpService extends AbstractService<Emp> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Emp findById(Long id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子とバージョン番号でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @param versionNo
     *            バージョン番号
     * @return エンティティ
     */
    public Emp findByIdVersion(Long id, Integer versionNo) {
        return select().id(id).version(versionNo).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Emp> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}