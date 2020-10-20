package org.sample.safepoint;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

/**https://blog.csdn.net/Pig_Pig_Bang/article/details/81068888 Windows Performance Toolkit安装
 * http://javadox.com/org.openjdk.jmh/jmh-core/1.6.2/org/openjdk/jmh/profile/WinPerfAsmProfiler.html 使用设置
 * https://www.sczyh30.com/posts/Java/jvm-gc-safepoint-condition/
 * @author Administrator
 * @date 2020/9/28
 *
 */
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(value = 3, jvmArgsPrepend = {"-Djmh.ignoreLock=true"})
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class EmptyBench {
    @Benchmark
    public void emptyMethod() {
        // This method is intentionally left blank.
    }
}