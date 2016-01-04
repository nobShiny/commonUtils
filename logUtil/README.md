一个log处理的工具类：

	通过使用LogHelper的trace()方法，在调试的时候我们可以非常方便地打印应用的执行流程。

使用步骤：

1. 将项目下的 LogHelper 拷贝到你的项目下。
		
2. 在需要查看log信息位置的地方调用LogHelper.trace(object)方法即可。（如果需要打印一些内容，object为相应的数据，如果不需要参数，传null即可）

![](http://i.imgur.com/lf3ezbM.png)


注：可以自定义log日志的输入形式。当前调试log 的TAG为当前app的默认包名。