package com.yuroyoro.scala.sastruts.entity;

import java.math.BigDecimal;
import java.sql.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Emp}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.39", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2009/09/02 21:59:32")
public class EmpNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Long> id() {
        return new PropertyName<Long>("id");
    }

    /**
     * empNoのプロパティ名を返します。
     * 
     * @return empNoのプロパティ名
     */
    public static PropertyName<Integer> empNo() {
        return new PropertyName<Integer>("empNo");
    }

    /**
     * empNameのプロパティ名を返します。
     * 
     * @return empNameのプロパティ名
     */
    public static PropertyName<String> empName() {
        return new PropertyName<String>("empName");
    }

    /**
     * mgrIdのプロパティ名を返します。
     * 
     * @return mgrIdのプロパティ名
     */
    public static PropertyName<Integer> mgrId() {
        return new PropertyName<Integer>("mgrId");
    }

    /**
     * hiredateのプロパティ名を返します。
     * 
     * @return hiredateのプロパティ名
     */
    public static PropertyName<Date> hiredate() {
        return new PropertyName<Date>("hiredate");
    }

    /**
     * salのプロパティ名を返します。
     * 
     * @return salのプロパティ名
     */
    public static PropertyName<BigDecimal> sal() {
        return new PropertyName<BigDecimal>("sal");
    }

    /**
     * deptIdのプロパティ名を返します。
     * 
     * @return deptIdのプロパティ名
     */
    public static PropertyName<Integer> deptId() {
        return new PropertyName<Integer>("deptId");
    }

    /**
     * versionNoのプロパティ名を返します。
     * 
     * @return versionNoのプロパティ名
     */
    public static PropertyName<Integer> versionNo() {
        return new PropertyName<Integer>("versionNo");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _EmpNames extends PropertyName<Emp> {

        /**
         * インスタンスを構築します。
         */
        public _EmpNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _EmpNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _EmpNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Long> id() {
            return new PropertyName<Long>(this, "id");
        }

        /**
         * empNoのプロパティ名を返します。
         *
         * @return empNoのプロパティ名
         */
        public PropertyName<Integer> empNo() {
            return new PropertyName<Integer>(this, "empNo");
        }

        /**
         * empNameのプロパティ名を返します。
         *
         * @return empNameのプロパティ名
         */
        public PropertyName<String> empName() {
            return new PropertyName<String>(this, "empName");
        }

        /**
         * mgrIdのプロパティ名を返します。
         *
         * @return mgrIdのプロパティ名
         */
        public PropertyName<Integer> mgrId() {
            return new PropertyName<Integer>(this, "mgrId");
        }

        /**
         * hiredateのプロパティ名を返します。
         *
         * @return hiredateのプロパティ名
         */
        public PropertyName<Date> hiredate() {
            return new PropertyName<Date>(this, "hiredate");
        }

        /**
         * salのプロパティ名を返します。
         *
         * @return salのプロパティ名
         */
        public PropertyName<BigDecimal> sal() {
            return new PropertyName<BigDecimal>(this, "sal");
        }

        /**
         * deptIdのプロパティ名を返します。
         *
         * @return deptIdのプロパティ名
         */
        public PropertyName<Integer> deptId() {
            return new PropertyName<Integer>(this, "deptId");
        }

        /**
         * versionNoのプロパティ名を返します。
         *
         * @return versionNoのプロパティ名
         */
        public PropertyName<Integer> versionNo() {
            return new PropertyName<Integer>(this, "versionNo");
        }
    }
}