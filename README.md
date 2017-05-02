# DesignPattern

[学习记录](https://xsfelvis.github.io/2016/11/13/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E5%AD%A6%E4%B9%A0/)


##单例模式

1、普通写法

使用volitate关键字+双重枷锁(DLC)

2、推荐更加优雅的写法

静态内部类的单例模式

    `public static HttpUtil getInstance() {
        return HttpUtilHolder.sInstance;
    }
    /**
     * 静态内部类
     */
    private static class HttpUtilHolder {
        private static final HttpUtil sInstance = new HttpUtil();
    }`

3、使用容器实现单例模式

