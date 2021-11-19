package aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.Map;

public class LambdaMethodHandler {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        logcontext(context);
        return "handleRequest: Hello World - " + input;
    }

    public String handleRequest(Map<String,String> input, Context context) {
        context.getLogger().log("Input: " + input);
        logcontext(context);
        return "handleRequest: Hello World - " + input;
    }

    public String handleMapRequest(Map<String,String> input, Context context) {
        context.getLogger().log("Input: " + input);
        logcontext(context);
        return "handleMapRequest: Hello World - " + input;
    }

    public String handleStringRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        logcontext(context);
        return "handleStringRequest :Hello World - " + input;
    }

    private void logcontext(Context context){
        context.getLogger().log("AWS RequestID: {}" + context.getAwsRequestId());
        context.getLogger().log("FunctionName: {}" + context.getFunctionName());
        context.getLogger().log("Function Version: {}" + context.getFunctionVersion());
        context.getLogger().log("LOgGroupName: {}" + context.getLogGroupName());
        context.getLogger().log("MemoryLimit: {}" + context.getMemoryLimitInMB());
        context.getLogger().log("Function ARN: {}" + context.getInvokedFunctionArn());
        context.getLogger().log("toString: {}" + context.toString());

    }
}