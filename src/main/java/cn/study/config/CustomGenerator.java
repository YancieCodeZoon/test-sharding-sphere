package cn.study.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CustomGenerator {
    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();
        
        generator.setTemplateEngine(new FreemarkerTemplateEngine());
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("Yancie");
        globalConfig.setOpen(false);
        globalConfig.setSwagger2(true);
        generator.setGlobalConfig(globalConfig);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/test01?useUnicode=true&characterEncoding=UTF-8&useSSL=false&allowMultiQueries=true&serverTimezone=Asia/Shanghai");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        generator.setDataSource(dataSourceConfig);

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("cn.study");
        packageConfig.setController("web");
        packageConfig.setEntity("model");
        packageConfig.setMapper("dao");
        packageConfig.setXml("dao");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        generator.setPackageInfo(packageConfig);

        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix("");
        strategy.setEntityLombokModel(true);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        generator.setStrategy(strategy);

        generator.setTemplateEngine(new FreemarkerTemplateEngine());
        generator.execute();

    }

}
