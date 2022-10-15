# Build Tools Homework

## Problem 1：理解标准 gradle 项目中各部分的含义

请在下方 ✅ 后面填写你对该文件或文件夹含义的理解

```
├── app ✅  Java项目文件夹     
│         ├── build ✅   经过./gradlew build 之后产生的构建文件夹，存放中间结果和打包好的内容     
│         ├── build.gradle ✅  构建app项目的gradle配置文件      
│         └── src        
│             ├── main ✅  源码文件夹       
│             └── test ✅  测试代码文件夹 
├── gradle        
│         └── wrapper        
│             ├── gradle-wrapper.jar ✅ 包含指定版本的Gradle代码，具体版本在gradle-wrapper.properties中       
│             └── gradle-wrapper.properties ✅ 包含Wrapper在运行时的重要属性，例如Gradle的版本       
├── gradlew ✅   在Linux环境下使用Wrapper来操作Gradle任务的脚本     
├── gradlew.bat ✅  在Windows环境下使用Wrapper来操作Gradle任务的脚本       
└── settings.gradle ✅  整个Gradle项目的配置文件      
```

## Problem 2：引入第三方 library 重构代码

请引入 `31.1-jre` 版本的 `Guava` 库，使用 `Joiner` 重构 `StringJoiner` 类的 `join` 方法。

请确保重构后的代码可以通过全部测试。

通过全部测试的验证方法可在下列两种方法中任选其一：

* 运行 ./gradlew test ，程序运行成功。
* 在 Intellij 中找到 StringJoinerTest.java 文件，点击类名左侧的绿色双箭头，选择 `Run StringJoinerTest`。
