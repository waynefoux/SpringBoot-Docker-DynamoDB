This is a demo application to test out a REST API using DynamoDB.

You will need
1 Docker installed
2 Docker compose installed
3 aws-cli installed

after starting the service you will need to run this command to create the table in Dynamo.
aws dynamodb --endpoint-url http://localhost:8000 create-table --table-name People --attribute-definitions AttributeName=Name,AttributeType=S --key-schema AttributeName=Name,KeyType=HASH --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5