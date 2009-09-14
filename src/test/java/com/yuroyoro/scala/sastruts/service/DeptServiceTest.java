package com.yuroyoro.scala.sastruts.service;

import javax.annotation.Generated;
import org.seasar.extension.unit.S2TestCase;

/**
 * {@link DeptService}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.39", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2009/09/02 21:59:40")
public class DeptServiceTest extends S2TestCase {

    private DeptService deptService;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #deptService}が利用可能であることをテストします。
     * 
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(deptService);
    }
}