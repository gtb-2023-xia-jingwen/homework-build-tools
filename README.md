# Build Tools Homework

## Problem 1：理解标准 gradle 项目中各部分的含义

请在下方 ✅ 后面填写你对该文件或文件夹含义的理解

```
├── app ✅       
│         ├── build ✅        
│         ├── build.gradle ✅        
│         └── src        
│             ├── main ✅        
│             └── test ✅        
├── gradle        
│         └── wrapper        
│             ├── gradle-wrapper.jar ✅        
│             └── gradle-wrapper.properties ✅        
├── gradlew ✅        
├── gradlew.bat ✅        
└── settings.gradle ✅        
```

## Problem 2：引入第三方 library 重构代码

请引入 `29.0-jre` 版本的 `Guava` 库，使用 `Joiner` 重构 `StringJoiner` 类的 `join` 方法。

请确保重构后的代码可以通过全部测试。

通过全部测试的验证方法可在下列两种方法中任选其一：

* 运行 ./gradlew test ，程序运行成功。
* 在 Intellij 中找到 StringJoinerTest.java 文件，点击类名左侧的绿色双箭头，选择 `Run StringJoinerTest`。
