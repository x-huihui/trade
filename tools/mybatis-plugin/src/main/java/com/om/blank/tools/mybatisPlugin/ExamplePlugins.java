package com.om.blank.tools.mybatisPlugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;

public class ExamplePlugins extends PluginAdapter {

    private String clientBaseUrl;

    public ExamplePlugins(){}
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        introspectedTable.setExampleType("com.om.blank.trade.mybatis.base.BaseExample");
        clientBaseUrl = introspectedTable.getContext().getJavaClientGeneratorConfiguration().getTargetProject().toString();
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        interfaze.addImportedType(new FullyQualifiedJavaType("com.om.blank.trade.mybatis.base.BaseMapper"));
        interfaze.addSuperInterface(new FullyQualifiedJavaType("BaseMapper"));
        return true;
    }
}
