---
mermaid: true
---
# JAVA 讲义

该仓库储存北理移动政务实验室JAVA培训的讲稿和代码，以及数据库的相关内容。该讲义假设读者完成了C语言的学习。感谢 @lijunlin2022 学长。

如有不足之处，请各位读者指出。可通过Issue或[邮箱](mailto:jingkaimori@gmail.com)发送留言。

仓库的地址在[https://github.com/jingkaimori/javaTutorial](https://github.com/jingkaimori/javaTutorial)

## 目录
1. 开发环境
    1. [搭建开发环境](./开发环境/开发环境.md)
    2. [编译并运行Java代码](./开发环境/第一个Java程序.md)
2. 基础语法
    1. [表达式与函数](./基础语法/02_表达式和函数.md)
        1. 嵌套的函数调用（暂缺）
        2. 函数定义
        3. 常用表达式
        4. 内置数值函数
    2. [数据类型](./基础语法/01_数据类型.md)
        1. [字符串](./基础语法/03_字符串.md)
    3. [控制流程](./基础语法/04_控制流程.md)（不完善）
        1. 条件语句
        2. 中断控制语句——break case;
    4. [命令行输入输出](./基础语法/05_输入输出.md)
        1. Scanner
3. 复杂的数据结构、类型和控制流
    1. [类与对象](./类型与对象/01_类与对象.md)
        1. 构造器（构造函数）
        2. this关键字
        3. [包 package](./类型与对象/02_package和import.md)
        4. [类的静态成员](./类型与对象/05_类的静态成员.md)
        5. 访问控制
            1. public
            2. private
            3. JavaBean类
    2. [类型规则与接口](./类型与对象/03_接口初步.md)
    3. [异常](./类型与对象/04_异常.md)
        1. throw与AutoClosable
        2. throw与Throwable
    4. [泛型](./类型与对象/08_泛型.md)
    5. [注解](./类型与对象/09_注解.md)
    6. [函子（函数表达式）](./类型与对象/10_函子.md)（不完善）
        1. 函数作为输入/输出
        2. 匿名类和函子的联系
    7. [集合与迭代器](./类型与对象/11_容器与集合.md)（不完善）
        1. 用泛型定义列表、集合和字典
        2. for-each 遍历列表
        3. 流
4. [面向对象](./面向对象/01_什么是面向对象.md)
    1. [继承](./面向对象/03_继承.md)
    2. [抽象类](./面向对象/06_抽象类.md)
    3. [接口](./面向对象/07_接口.md)
    4. [多态](./面向对象/05_多态.md)
5. Java的多线程（暂缺）
    1. 创建线程
    2. 线程的执行权
        1. wait 和 notify 方法
    3. 数据竞争
    4. 未来量
    5. 锁
6. 其他数据类型
    1. [大数值](./其他数据类型/01_大数值.md)
    2. [数组和数组字面量](./其他数据类型/02_数组.md)
        1. 一维数组
        2. 嵌套数组或多维数组
7. Java的内置操作（暂缺）
    1. 文件读写
    2. 反射编程
    3. 垃圾回收
8. Java还缺什么
    1. 全局变量（暂缺）
    2. 对象的序列化（暂缺）
    3. 将任意函数作为变量传递（一等函数）
9. 其他技术 
    1. [SQL语言](./数据库基本知识/SQL.md)
    1. JDBC 操作数据库
    2. AOP 面向切面编程
    3. Jackson 或 gson 以JSON格式转换对象
    4. Lombok 封装对象
    5. lwjgl 3D视频库
10. 示例程序（暂缺）
    1. 三角形面积计算（不真实）
    1. 光线传播模拟
    2. 类似excel的函数运算
    4. 电路模拟器
    5. 税收管理系统

## 学习顺序

<div class="mermaid">
flowchart LR

    classDef default fill:#fef;
    classDef important fill:#cff;

    env[搭建开发环境]
    1stprog[第一个Java程序]
    function[用函数来组织代码]
    expression[表达式和算术运算]
    datatype[数据类型和类型规则]
    string[字符串]
    arbitarynum[任意精度数值]
    array[方括号数组]
    io[命令行输入输出]
    ctrlflow[控制流]
    classObj[对象定义]
    staticMember[类的静态成员]
    import[导入语句]
    exception[异常处理]
    generic[泛型]
    annotation[注解]
    oo[面向对象基本概念]
    inhertance[继承]
    polymorphism[多态]
    interface[接口]
    abstractClass[抽象类]
    functor[函子]
    customException[定义异常类型]
    autoClose[处理资源异常]
    customAutoClose[自定义可关闭的资源]
    iterate[迭代与集合]
    reflect[反射]

    env --> 1stprog
    1stprog --> function
    function --> expression
    function --> ctrlflow
    1stprog --> expression
    expression --> datatype
    expression --> string
    expression --> arbitarynum
    expression --> array
    datatype --> exception
    ctrlflow --> exception
    datatype --> classObj
    function --> classObj
    expression --> classObj
    function --> staticMember
    classObj --> staticMember
    string --> io
    function --> import
    annotation --> reflect
    classObj --> reflect
    datatype --> generic
    generic --> iterate
    classObj --> iterate
    function --> annotation
    classObj --> annotation
    classObj --> oo
    function --> oo
    oo --> inhertance
    classObj --> abstractClass
    abstractClass -.-> interface
    classObj --> interface
    function --> polymorphism
    datatype --> polymorphism
    function --> functor
    interface --> functor
    exception --> customException
    exception --> autoClose
    autoClose --> customAutoClose
    class 1stprog,function,expression,datatype,ctrlflow,classObj,exception,generic,interface,functor,iterate important;
</div>

## 其他未尽事宜

淘汰`Person``student`类型关系，改用有示例功能的代码。