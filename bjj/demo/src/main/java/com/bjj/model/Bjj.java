package com.bjj.model;

import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

/*
@ConfigurationProperties作用：
默认从全局配置文件中获取值；
将配置文件中配置的每一个属性的值，映射到这个组件中；
告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
参数 prefix = “bjj” : 将配置文件中的person下面的所有属性一一对应
*/
@Component  //注册bean
@ConfigurationProperties(prefix = "bjj")   //扫描配置文件
@Validated  //数据校验
public class Bjj {
    private String name;
    private String sex;
    private Map<String, String> maps;
    private List<Object> lists;

    /**
     * 空检查
     * @Null 验证对象是否为null
     * @NotNull 验证对象是否不为null, 无法查检长度为0的字符串
     * @NotBlank 检查约束字符串是不是Null还有被Trim的长度是否大于0, 只对字符串, 且会去掉前后空格.
     * @NotEmpty 检查约束元素是否为NULL或者是EMPTY.
     *
     * Booelan检查
     * @AssertTrue 验证 Boolean 对象是否为 true
     * @AssertFalse 验证 Boolean 对象是否为 false
     *
     * 长度检查
     * @Size(min=, max=) 验证对象（Array,Collection,Map,String）长度是否在给定的范围之内
     * @Length(min=, max=) string is between min and max included.
     *
     * 日期检查
     * @Past 验证 Date 和 Calendar 对象是否在当前时间之前
     * @Future 验证 Date 和 Calendar 对象是否在当前时间之后
     * @Pattern 验证 String 对象是否符合正则表达式的规则
     */
    @Email(message="邮箱格式错误") //name必须是邮箱格式
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Bjj{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                ", email='" + email + '\'' +
                '}';
    }
}
