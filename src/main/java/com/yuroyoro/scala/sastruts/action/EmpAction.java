package com.yuroyoro.scala.sastruts.action;

import java.math.BigDecimal;
import java.util.Date;


import javax.annotation.Resource;

import org.apache.struts.action.ActionMessages;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;

import com.yuroyoro.scala.sastruts.entity.Emp;
import com.yuroyoro.scala.sastruts.service.EmpService;
import com.yuroyoro.scala.sastruts.form.EmpForm;

public class EmpAction {


    public List<Emp> empItems;
    
    @ActionForm
    @Resource
    protected EmpForm empForm;

    @Resource
    protected EmpService empService;

    public JdbcManager jdbcManager;

    @Execute(validator = false)
    public String index() {
        empItems = empService.findAll();

        return "list.jsp";
    }





    @Execute(validator = false, urlPattern = "show/{id}")
    public String show() {
        Emp entity = empService.findById(Long.valueOf(empForm.id));
        Beans.copy(entity, empForm).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false, urlPattern = "edit/{id}")
    public String edit() {
        Emp entity = empService.findById(Long.valueOf(empForm.id));
        Beans.copy(entity, empForm).dateConverter("yyyy-MM-dd").execute();
        return "edit.jsp";
    }

    @Execute(validator = false)
    public String create() {
        return "create.jsp";
    }

    @Execute(validator = false, urlPattern = "delete/{id}/{versionNo}", redirect = true)
    public String delete() {
        Emp entity = Beans.createAndCopy(Emp.class, empForm).dateConverter("yyyy-MM-dd").execute();
        empService.delete(entity);
        return "/emp/";
    }

    @Execute(input = "create.jsp", redirect = true)
    public String insert() {
        Emp entity = Beans.createAndCopy(Emp.class, empForm).dateConverter("yyyy-MM-dd").execute();
        empService.insert(entity);
        return "/emp/";
    }

    @Execute(input = "edit.jsp", redirect = true)
    public String update() {
        Emp entity = Beans.createAndCopy(Emp.class, empForm).dateConverter("yyyy-MM-dd").execute();
        empService.update(entity);
        return "/emp/";
    }
}