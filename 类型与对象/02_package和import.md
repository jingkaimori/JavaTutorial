# package

##　命名冲突与包

我们知道，在一个代码文件里面，如果出现了同名的常量或者变量，就会产生命名冲突。

在C++和C#里面，是采用命名空间来解决名字冲突问题的

```c++
#include <iostream>
#include <string>
using namespace std;

namespace A {
    int age = 18;
    string gender = "male"; 
}

namespace B {
    int age = 20;
    string gender = "female";
}

int main() {
    cout << "-----A-----" << endl;
    cout << A::age << " " << A::gender << endl;
    cout << "-----B-----" << endl;
    cout << B::age << " " << B::gender << endl;
    return 0;
}
```



而在Java中，则常常使用包来解决命名冲突

在实际项目开发中，往往需要很多不同的包。假如两个开发人员再同一个软件项目中创建了两个名字的类，那么就产生了名冲突。可以将两个同名类放置到不同的包中，就不会产生冲突了。C++和C#通过命名空间解决名字冲突的问题，本质上和Java的包类似。

Java允许把多个类组成一组，称作软件包。包（package）是类的逻辑组织形式，有一组类和接口组成。如果在程序中吗没有声明包，类就放在默认的包中，这个包是没有名字的。魔刃豹使用于小的程序中，如果程序比较打，就需要创建自己的包。

## 定义与格式

创建一个包的格式是：

package 包名:

如果源程序中缺省包语句，则源程序中定义的类默认属于无名包。此外，在一个包中，还可以声明包，即包中可以有子包，中间通过`.`分割，可见包的结构，类似于文件夹或目录的层级结构（Hierarchical structure）



不属于包的类存放在当前工作目录下，

`src`是source的缩写，是“来源、出处”的意思，一般就是你代码存放的目录

```html
src
|--A_1.java
```



有包名的Java类源文件需存到有对应目录结构的目录下

```html
src
|--A
   |--A_1.java
```

在A_1.java里面，代码是这样的：

```java
package A;

public class A_1 {
    
}
```



包还可以嵌套：

```java
src
|--A
   |--A_1.java
   |--B
      |--B_1.java
```

在B_1.java里面，代码是这样的

```java
package A.B;

public class B_1 {
    
}
```



此外：SUN公司之前建议使用倒序的域名作为包名，比如我们学校域名为www.bit.edu.cn，那么顶级包名可以是cn.edu.bit，然后再在这个包下面进一步划分子包



## import

对于简单的问题，一个类单独就可以完成：对于复杂的问题，需要借助其他来来完成。

我们知道C语言中可以通过include把库函数包含到当前程序中，这样可以使用库函数了。Java则使用import

常见的Java包

| 序号 | 包        | 说明                   |
| ---- | --------- | ---------------------- |
| 1    | java.lang | 基本语言类             |
| 2    | java.util | 工具包，包含数据结构类 |
| 3    | java.io   | 输入输出类             |
| 4    | java.sql  | 数据库操作类           |

> https://www.oracle.com/java/technologies/javase-jdk8-doc-downloads.html
>
> 这是JDK的文档，大家可以下载到本地查看，里面对很多类都进行了解释



之前我们用Scanner的时候，就接触到了import

先看导入系统类的例子：

```java
import java.util.*; //*是通配符，表示引入该包下的所有的类
//import java.util.Scanner 就是只引入该包下的Scanner类
public class Main {
    public static void main(String[] args) {
        //系统自动引入java.lang包
        System.out.println(Math.sqrt(2));

        //java.util.Date
        Date day = new Date();
        System.out.println(day);
    }
}
```

然后看导入自定义类的例子：

现在目录结构如下：

```html
src
|--A
   |--A_1.java
   |--B
      |--B_1.java
|--Main.java
|--C_1.java
```



```java
import A.A_1;
import A.B.B_1;

public class Main {
    public static void main(String[] args) {
        A_1 a = new A_1();
        B_1 b = new B_1();
        C_1 c = new C_1();	//C_1位于无名包，与Main同目录,自动导入
        System.out.println(a.age);
        System.out.println(b.gender);
        System.out.println(c.name);
    }
}
```

