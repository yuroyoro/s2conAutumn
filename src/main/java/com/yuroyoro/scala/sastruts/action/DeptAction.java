package com.yuroyoro.scala.sastruts.action;



import javax.annotation.Resource;

import org.apache.struts.action.ActionMessages;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;

import com.yuroyoro.scala.sastruts.entity.Dept;
import com.yuroyoro.scala.sastruts.service.DeptService;
import com.yuroyoro.scala.sastruts.form.DeptForm;

public class DeptAction {


    public List<Dept> deptItems;
    
    @ActionForm
    @Resource
    protected DeptForm deptForm;

    @Resource
    protected DeptService deptService;

    public JdbcManager jdbcManager;

    @Execute(validator = false)
    public String index() {
        deptItems = deptService.findAll();

        return "list.jsp";
    }





    @Execute(validator = false, urlPattern = "show/{id}")
    public String show() {
        Dept entity = deptService.findById(Long.valueOf(deptForm.id));
        Beans.copy(entity, deptForm).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false, urlPattern = "edit/{id}")
    public String edit() {
        Dept entity = deptService.findById(Long.valueOf(deptForm.id));
        Beans.copy(entity, deptForm).dateConverter("yyyy-MM-dd").execute();
        return "edit.jsp";
    }

    @Execute(validator = false)
    public String create() {
        return "create.jsp";
    }

    @Execute(validator = false, urlPattern = "delete/{id}/{versionNo}", redirect = true)
    public String delete() {
        Dept entity = Beans.createAndCopy(Dept.class, deptForm).dateConverter("yyyy-MM-dd").execute();
        deptService.delete(entity);
        return "/dept/";
    }

    @Execute(input = "create.jsp", redirect = true)
    public String insert() {
        Dept entity = Beans.createAndCopy(Dept.class, deptForm).dateConverter("yyyy-MM-dd").execute();
        deptService.insert(entity);
        return "/dept/";
    }

    @Execute(input = "edit.jsp", redirect = true)
    public String update() {
        Dept entity = Beans.createAndCopy(Dept.class, deptForm).dateConverter("yyyy-MM-dd").execute();
        deptService.update(entity);
        return "/dept/";
    }
}