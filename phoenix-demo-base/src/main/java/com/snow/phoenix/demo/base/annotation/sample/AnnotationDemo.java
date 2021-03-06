/*
 *  Copyright 2016-2020 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       QQ:1322874562  PHONE:13882946572
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.snow.phoenix.demo.base.annotation.sample;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2017/8/18          FXY        Created
 **********************************************
 */


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 方法求和注解类
 * <p>
 * 注解类中方法名就是属性，不能有参数
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AnnotationDemo {

    //此方法使用时不需要指定变量名
//    String value();

    //默认的方法名，使用注解时可以不用指定变量
//    String version() default "1.0";

    //方法名既不是value()又没有默认值时，使用注解必须加上变量名
    String version();
}
