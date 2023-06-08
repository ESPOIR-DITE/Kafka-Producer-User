package org.example.producer;


import magicalpipelines.EntityLifeStages;
import net.datafaker.Faker;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.example.config.producerEnv.EnvApp;
import org.example.model.User;
import org.example.model.UserSerializer;
import org.example.util.AppUtils;

import java.util.Date;
import java.util.Properties;

import static java.lang.Thread.sleep;

public class ProducerClient {

     static UserSerializer userSerializer = new UserSerializer();
    public static void producer(EnvApp config) throws InterruptedException {
        Properties properties = AppUtils.getProperties(config);
        Producer<String, EntityLifeStages> producerClient = new KafkaProducer<>(properties);


        while (true) {
//            byte[] data = getUser();
            EntityLifeStages data = getUserEntityLifeStages();
            ProducerRecord<String, EntityLifeStages> record = new ProducerRecord<>(config.topic(), null, data);
            producerClient.send(record);
            producerClient.flush();
            sleep(5000);
        }
    }
    public static byte[] getUser(){
        Date datePast = new Date(-315626400000L);
        Date dateFuture = new Date(2524600800000L);
        Faker faker = new Faker();
        User user = new User(faker.name().name(),faker.date().between(datePast, dateFuture),faker.number().positive());
        System.out.println(user);
        return userSerializer.serialize("",user);
    }
    public static EntityLifeStages getUserEntityLifeStages(){
        Faker faker = new Faker();
        EntityLifeStages stages = EntityLifeStages.newBuilder()
                .setName(faker.name().name())
                .setBirthDate(faker.date().birthday().getTime())
                .setCreatedAt(new Date().getTime())
                .setLoginNumber(faker.number().numberBetween(50, 2000))
                .setLifeStage(" ")
                .build();
        System.out.println(stages);
         return stages;
    }

}
