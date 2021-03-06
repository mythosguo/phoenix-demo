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

package com.snow.phoenix.demo.base.java8.lambda.function.sample;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2017/9/23          FXY        Created
 **********************************************
 */


/**
 * 无返回值的函数式接口，注解可以省略
 * <p>
 * java8中的函数式编程是针对于接口来的，要想使用匿名函数，或者是将函数作为参数，都只能通过接口来
 * <br>
 * 参考网址：<a>http://blog.csdn.net/xiuye2015/article/details/51573829</a>
 */
public interface FunctionInterfaceVoid {
    public void f();
}
