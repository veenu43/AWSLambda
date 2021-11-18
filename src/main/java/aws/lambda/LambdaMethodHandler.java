package aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.Map;

public class LambdaMethodHandler {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }

    public String handleRequest(Map<String,String> input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }

    public String handleMapRequest(Map<String,String> input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }
}