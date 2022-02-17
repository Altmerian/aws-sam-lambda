package com.epam.cloudx.pavelsh.awscicd.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ApplicationHandler implements RequestHandler<String, String> {

  @Override
  public String handleRequest(String s, Context context) {
    return String.format("Input=[%s]", s);
  }
}
