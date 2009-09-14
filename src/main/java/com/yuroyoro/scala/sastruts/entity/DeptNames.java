package com.yuroyoro.scala.sastruts.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Dept}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.39", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2009/09/02 21:59:32")
public class DeptNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Long> id() {
        return new PropertyName<Long>("id");
    }

    /**
     * deptNoのプロパティ名を返します。
     * 
     * @return deptNoのプロパティ名
     */
    public static PropertyName<Integer> deptNo() {
        return new PropertyName<Integer>("deptNo");
    }

    /**
     * deptNameのプロパティ名を返します。
     * 
     * @return deptNameのプロパティ名
     */
    public static PropertyName<String> deptName() {
        return new PropertyName<String>("deptName");
    }

    /**
     * locのプロパティ名を返します。
     * 
     * @return locのプロパティ名
     */
    public static PropertyName<String> loc() {
        return new PropertyName<String>("loc");
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
    public static class _DeptNames extends PropertyName<Dept> {

        /**
         * インスタンスを構築します。
         */
        public _DeptNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _DeptNames(final String name) {
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
        public _DeptNames(final PropertyName<?> parent, final String name) {
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
         * deptNoのプロパティ名を返します。
         *
         * @return deptNoのプロパティ名
         */
        public PropertyName<Integer> deptNo() {
            return new PropertyName<Integer>(this, "deptNo");
        }

        /**
         * deptNameのプロパティ名を返します。
         *
         * @return deptNameのプロパティ名
         */
        public PropertyName<String> deptName() {
            return new PropertyName<String>(this, "deptName");
        }

        /**
         * locのプロパティ名を返します。
         *
         * @return locのプロパティ名
         */
        public PropertyName<String> loc() {
            return new PropertyName<String>(this, "loc");
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