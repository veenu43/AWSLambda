package aws.lambda.function;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface LambdaMethodRequest {

    @LambdaFunction(functionName = "JavaTest")
    String handleStringRequest(String input);
}
