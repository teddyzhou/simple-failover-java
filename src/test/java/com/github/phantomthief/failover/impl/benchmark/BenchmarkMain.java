package com.github.phantomthief.failover.impl.benchmark;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @author huangli
 * Created on 2020-01-21
 */
public class BenchmarkMain {
    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(BenchmarkWithoutSection.class.getSimpleName())
                .include(BenchmarkWithSection.class.getSimpleName())
                .output(System.getProperty("user.home") + "/benchmark.txt")
                .build();
        new Runner(options).run();
    }
}
