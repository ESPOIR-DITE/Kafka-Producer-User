package org.example.util;


import org.apache.kafka.clients.producer.ProducerConfig;
import org.example.config.AppProperties;

import java.util.Properties;

public class AppUtils {
    public static Properties getProperties(AppProperties appProperties){
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, appProperties.bootstrapServerHost()+":"+appProperties.bootstrapServerPort());
        properties.put("key.serializer", appProperties.serdeKey());
        properties.put("value.serializer", appProperties.serdeValue());
        return properties;
    }
}
