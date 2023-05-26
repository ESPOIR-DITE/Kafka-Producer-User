package org.example;

import org.example.config.producerEnv.EnvAppConfig;
import org.example.producer.Producer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EnvAppConfig config = new EnvAppConfig();
        Producer.producer(config);
    }
}