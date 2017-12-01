package com.zeroturnaround.callspy;

import java.lang.instrument.Instrumentation;

public class Agent {

  public static void premain(String args, Instrumentation instrumentation) throws Throwable {
    System.out.println("Started premain()");
    runAgent(args, instrumentation, true);
    System.out.println("Finished premain()");
  }

  public static void agentmain(String agentArgs, Instrumentation instrumentation) throws Throwable {
    System.out.println("Started agentmain()");
    runAgent(agentArgs, instrumentation, true);
    System.out.println("Finished agentmain()");
  }

  static void runAgent(String agentArgs, Instrumentation instrumentation, boolean injected) throws Exception {
    CallSpy transformer = new CallSpy();
    instrumentation.addTransformer(transformer);
  }
}
