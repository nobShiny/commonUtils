这是一个SharedPrefrenceUtil，封装了一些常用的读写操作，使用单例去初始化工具。


使用步骤：

1.在application中初始化sharedprefrence。

	SharedPreferenceUtil.init(getApplicationContext());

2.在需要的位置调用相关静态方法。