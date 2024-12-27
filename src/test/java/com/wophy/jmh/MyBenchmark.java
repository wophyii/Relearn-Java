package com.wophy.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import javax.swing.text.html.Option;

@State(Scope.Thread) // 每个线程有独立的实例
public class MyBenchmark {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    // 测试 StringBuilder 连接字符串的性能
    @Benchmark
    public String testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    // 测试 StringBuffer 连接字符串的性能
    @Benchmark
    public String testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}
