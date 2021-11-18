##Reference
https://www.baeldung.com/java-aws-lambda

##Build
mvn clean package shade:shade

##AWS
1. aws.lambda.LambdaMethodHandler::handleRequest
2. aws.lambda.LambdaRequestHandler::handleRequest