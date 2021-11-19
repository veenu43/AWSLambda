package aws.lambda.client;

import aws.lambda.function.LambdaMethodRequest;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class LambdaClient {
    public static void main(String[] args) {
        //Regions region = Regions.fromName("AP_SOUTHEAST_1");
        BasicAWSCredentials awscred =   new BasicAWSCredentials("AKIAWBE54CPXCGNW4IEU","+b8BSTG9LH3EvLuYruH1Prbc6UDuYJqox/3YNblz");
        AWSLambdaClientBuilder builder = AWSLambdaClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(awscred))
                .withRegion(Regions.AP_SOUTHEAST_1);

        final LambdaMethodRequest methodRequest = LambdaInvokerFactory.builder()
                .lambdaClient(builder.build())
                .build(LambdaMethodRequest.class);


        final String lambdaOutput = methodRequest.handleStringRequest("Test Client");
        System.out.println("lambda response = " + lambdaOutput);
    }
}
