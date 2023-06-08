package org.example.util;


import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.example.config.AppProperties;

import java.util.Properties;

public class AppUtils {
    public static Properties getProperties(AppProperties appProperties){
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, appProperties.bootstrapServerHost()+":"+appProperties.bootstrapServerPort());
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, appProperties.serdeKey());
        properties.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG,"http://"+appProperties.registryHost()+":"+appProperties.registryPort());
//        properties.put(AbstractKafkaAvroSerDeConfig.AUTO_REGISTER_SCHEMAS,false);
//        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, appProperties.serdeValue());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
//        properties.put()
//        properties.put(, appProperties.serdeValue());
        return properties;
    }
}
