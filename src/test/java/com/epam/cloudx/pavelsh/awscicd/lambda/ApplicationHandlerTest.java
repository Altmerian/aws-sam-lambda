package com.epam.cloudx.pavelsh.awscicd.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationHandlerTest {

  @Test
  public void test() {
    ApplicationHandler applicationHandler = new ApplicationHandler();
    String testInput = "test";
    String actual = applicationHandler.handleRequest(testInput, Mockito.mock(Context.class));
    String expected = String.format("Input=[%s]", testInput);
    assertEquals(expected, actual);
  }
}
