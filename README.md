编译

### 静态编译和动态编译（AOT   VS  JIT）

#### 静态编译

##### AOT编译

所谓 AOT 编译，是与即时编译相对立的一个概念。我们知道，即时编译指的是在程序的运行过程中，将字节码转换为可在硬件上直接运行的机器码，并部署至托管环境中的过程。而 AOT 编译指的则是，在程序运行之前，便将字节码转换为机器码的过程。它的成果可以是需要链接至托管环境中的动态共享库，也可以是独立运行的可执行文件。

AOT 编译的优点显而易见：我们无须在运行过程中耗费 CPU 资源来进行即时编译，而程序也能够在启动伊始就达到理想的性能。然而，与即时编译相比，AOT 编译无法得知程序运行时的信息，因此也无法进行基于类层次分析的完全虚方法内联，或者基于程序 profile 的投机性优化（并非硬性限制，我们可以通过限制运行范围，或者利用上一次运行的程序 profile 来绕开这两个限制）。这两者都会影响程序的峰值性能。

#### 动态编译

可以在运行时执行非保守优化

将优化与产品交付周期分开

–更新JVM，运行相同的应用程序，实现性能提升！

–可以调整到目标平台

可以知道很多java程序信息：

类加载，可执行方法，资料搜集

根据这些信息来调优

如果之前的假设是错误的，可能会重新优化

### JVM

运行时

类加载，字节的验证，同步

JIT

数据收集，编译计划

GC

不同的算法：吞吐，响应时间，容量

### JVM：使字节码更快

JVM通过JIT编译字节码

-使他们更快

-通过需要的时候编译他们：

  比如执行前

 或我们认为它很重要的时候

或者不编译

有些jit是高质量的优化编译器





