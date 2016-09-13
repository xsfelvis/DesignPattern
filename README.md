# DesignPattern
设计模式学习

##面向对象六大原则
- 单一职责原则（Single Responsibility Principle ）

单一职责并不是说一个类只有一个函数，而是说这类中高端函数所做的工作必须是高度相关的，即高内聚

- 里氏替换原则（ Liskov Substitution Principle）

所有引用基类的地方必须能够透明的使用其子类的对象，即只要父类出现的地方子类都可以出现，而且不会产生任何异常和错误，通常在封装底层库的时候常用，使用到了继承和多态

- 依赖倒置原则（Dependence Inversion Principle）

>高层模块不应该依赖低层模块、两者都应该依赖抽象
>
>抽象不应该依赖细节，细节应该依赖抽象

Note：在java中，抽象通常指接口或者抽象类，两者是不能被直接实例化的，细节就是实现类，实现接口或者继承抽象类而产生的类就是细节，其特点就是可以被直接实例化（new 出来）。依赖倒置原则在java语言的表现是`模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或者抽象类产生的`，核心就是`面向接口编程/面向抽象编程`

>开闭原则（Open-Close Principle）

对扩展开放，对修改关闭


参考资料

https://github.com/simple-android-framework-exchange/android_design_patterns_analysis/blob/master/oop-principles/oop-principles.md

##代理模式

>普通代理

>动态代理

参考资料

http://blog.csdn.net/l2show/article/details/46992495
http://www.cnblogs.com/xiaoluo501395377/p/3383130.html


##策略模式


核心是面向对象的继承和多态机制，主要有三个角色


- StrateManger

也加上下文角色，起到承上启下作用屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化

- Strategy抽象策略角色

策略、算法家族的抽象，通常为接口，用来定义每个策略或者算法必须具有的方法和属性

- ConcreateStrategy具体策略角色

使用场景：

- 多个类只有在算法或着行为上稍有不同的场景
- 算法需要自由切换的场景
- 需要屏蔽算法规则的场景

缺点：

- 策略类数量增多

每个策略都是一个类，复用的可能性很小，类数量增多

- 所有的策略类都需要对外暴露

上层模块必须知道有哪些策略，然后才能决定使用哪一个策略，这与迪米特法则是相违背的


参考资料:

《设计模式之禅》 策略模式

