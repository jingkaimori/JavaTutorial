有些时候，需要由较短的字符串构建字符串。比如，按键或者来自文件的单词。采用+连接效率就比较低。这时候我们就需要用StringBuilder对象

如下所示：

```java
public class FirstSample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("Java");
        System.out.println(builder.toString());
     }
}
```

StringBuilder的常用API列举如下：

> StringBuilder()	构建一个空的字符串构建器
>
> int length()	返回构建器或缓冲器的代码单元数量
>
> StringBuilder append(char c)	追加一个代码单元并返回this
>
> StringBuilder appendCodePoint(int cp)	追加一个代码点，将其转换为一个或两个代码单元并返回this
>
> void setCharAt(int i, char c)	将第i个代码单元设置为c
>
> StringBuilder insert(int offset, char c)	在offset位置插入一个代码单元并返回this
>
> StringBuilder delete(int startIndex, int endIndex)	删除偏移量从startIndex到endIndex-1的代码单元并返回this
>
> String toString()	返回一个与构建器内容相同的字符串

