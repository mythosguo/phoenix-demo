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

package com.snow.phoenix.demo.ood.decorator;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2017/10/21          FXY        Created
 **********************************************
 */


/**
 * 参考网址：
 * <br/>
 * <a>http://www.cnblogs.com/qiumingcheng/p/5219631.html</a>
 */
public class Main {

    //入口函数
    public static void main(String args[]) {
        Sourceable source = new Source();

        // 装饰类对象
        Sourceable obj = new Decorator1(new Decorator2(new Decorator3(source)));

        obj.operation();
    }
}
