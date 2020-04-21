package com.waynefoux.springboot.dynamodb.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.util.StringUtils;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(basePackages = "com.waynefoux.springboot.dynamodb.repo")
public class DynamoDbConfig {

    @Value("${amazon.dynamodb.endpoint}")
    private String dbEndpoint;

    @Value("${amazon.aws.accesskey}")
    private String accessKey;

    @Value("${amazon.aws.secretkey}")
    private String secretKey;

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        AmazonDynamoDB dynamoDB = new AmazonDynamoDBClient(amazonAwsCredentials());

        if (!StringUtils.isNullOrEmpty(dbEndpoint)) {
            dynamoDB.setEndpoint(dbEndpoint);
        }

        return dynamoDB;
    }

    @Bean
    public AWSCredentials amazonAwsCredentials() {
        return new BasicAWSCredentials(accessKey, secretKey);
    }
}
