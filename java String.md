[TOC]

可以说，Java是C++语法的一个“纯净”版本，这里没有头文件，没有指针运算（甚至指针语法），结构，联合，操作符重载，虚基类等等

```java
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

这个程序虽然很简单，但所有的Java应用程序都具有这样的结构。首先，Java是大小写敏感的。如果你把main写为Main就会报错。

下面开始来逐行查看这段源代码。

**public**被称为访问修饰符（access modifier），它用于控制程序其他部分对这段程序的访问级别。至于这具体是什么意思我们以后会谈到。

关键字**class**表明Java程序全部内容都包含在类中，这里先把类当作一个容器，之后会有大量篇幅来介绍类class

**class**后面跟着的是类名，类名必须以字母开头。标准的命名规范是：类名是以大写字母开头的名词，如果由多个单词组成，应该使用驼峰命名法

如果你观察可以发现，源代码文件的命名必须和class的名字相同，并用java作为拓展名

接下来解释class包裹的程序，public static我们首先忽略，不难理解这是一个主函数，没有返回值。

接下来，程序使用了System.out对象并调用了它的println方法。至于什么是对象，这又需要之后再解释。

println方法输出时会自带换行符，如果不希望带有换行符，可以使用print



## 注释

```java
// java支持单行注释

/*
	java也支持多行注释
*/

/**
* 这种注释可以用来自动生成文档，至于怎么做，我们之后会讲到
*/
```



## 数据类型

Java是一种强类型的语言，包括八种基本类型，列表如下：

### 整型

| 类型  | 存储需求 | 取值范围                                               |
| ----- | -------- | ------------------------------------------------------ |
| int   | 4字节    | -2 147 483 648 ~ 2 147 483 647                         |
| short | 2字节    | -32 768 ~ 32767                                        |
| long  | 8字节    | -9 223 372 036 854 775 808 ~ 9 223 372 036 854 775 807 |
| byte  | 1字节    | -128 ~ 127                                             |
|       |          |                                                        |

### 浮点类型

| 类型   | 存储需求 | 取值范围                                             |
| ------ | -------- | ---------------------------------------------------- |
| float  | 4字节    | 大约±3.402 823 47E + 38F(有效位数为6~7位)            |
| double | 8字节    | 大约±1.797 693 134 862 315 70E + 308(有效位数为15位) |

float类型的数值有一个后缀F。没有F的浮点数值默认为double类型



### char类型

不建议使用char类型



### boolean类型

boolean（布尔）类型有两个值：false和true

>  在C++中，整数0相当于布尔值false，非0值相当于布尔值true，在java中则不行



### 变量

声明变量以及变量初始化：

```java
double salary;
int vacationDays;
long earthPopulation;
boolean done;
```

```java
int i = 10;
```



### 常量

java中，利用`final`声明常量，常量一般大写

```java
final PAI = 3.14159;
```



### 运算符

与C语言基本相同



### 位运算符

与C语言基本相同



### 数学函数与变量

Java在Math类中，包含了各种各样的数学函数，我们需要使用时，在程序顶部加上

```java
import static java.lang.Math.*;
```

简单列举如下：

* 乘方开方
  * sqrt(x)——给x开根号
  * pow(x, a)——求x的a次幂
* 三角函数
  * sin(a)
  * cos(a)
  * tan(a)
* 常量
  * PI
  * E



### 强制类型转换

与C语言类似



### 括号与运算符

与C语言类似



### 枚举

与C语言类似



### 字符串

标准的Java类库中有String类型

**Java字符串必须时双引号，否则会报错**

#### 子串`substring`，左闭右开

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.substring(0,3);
        System.out.println(str2);
  	}
}
```

和js中的substring()很像，不过这种情况js我们大部分用slice



#### 拼接

直接写 + 号

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + str2);
    }
}
```

#### 检查字符串是否相等equals

返回值时true或者false

**一定不能用==来检查两个字符串是否相等**

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1.equals(str2));
    }
}
```

charAt()

和js类似

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.charAt(1));
    }
}
```

#### length()

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.length());
    }
}
```

codePointAt()

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.codePointAt(0));    
        //输出H的ASCIIA码
    }
}

```

## 字符串的API

## char charAt(int index)

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.charAt(0));
    }
}

//输出H
```



## int codePointAt(int index)

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.codePointAt(0));
    }
}

//输出H的ASCIIA码
```



## int offsetByCodePoints(int startIndex, int cpCount)



//前三个和代码点预计代码单元有关系，之后再细看



## int compareTo(String other)

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "banana";
        System.out.println(str1.compareTo("apple"));    //banana大于apple，返回一个正数
        System.out.println(str1.compareTo("car"));      //banana小于car，返回一个负数
        System.out.println(str1.compareTo("banana"));   //相同字符串，返回0
    }
}

```

有点类似于C语言的`strcmp`函数，C语言的`strcmp(str1, str2)`，str1 > str2 返回正， str1 < str2 返回负，str1 = str2 返回0

可以把java中的str1.compareTo(str2)

## boolean endWith(String suffix)

```java
public class FirstSample {
    public static void main(String[] args) {
        String str1 = "banana";
        System.out.println(str1.endsWith("na"));    //以na结尾，返回true
        System.out.println(str1.endsWith("ba"));    //否则，返回false
    }
}

```



## boolean equals(Object other)

如果字符串与other相等，返回true，否则返回false



## boolean equalgnoreCase(String other)

忽略大小写，如果相等返回true，否咋返回false



## int IndexOf(String str)

## int IndexOf(String str, int fromIndex)

## int IndexOf(int cp)

## int IndexOf(int cp, int fromIndex)

返回与字符串str或代码点cp匹配的第一个字串开始的位置。这个位置从索引0或fromIndex开始计算。如果在原始串中不存在str，返回-1



## int lastIndexOf(String str)

## int lastIndexOf(String str, int fromIndex)

## int lastIndexOf(int cp)

## int lastIndexOf(int cp, int fromIndex)

返回与字符串str和代码点匹配的最后字串的开始位置。这个位置从原始字符串的末尾或fromIndex开始计算



## int length()

返回与字符串的长度

## int codePointCount(int startIndex, int endIndex)

## String replace(CharSequence oldString, CharSequence newString)





