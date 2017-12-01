package com.zeroturnaround.callspy;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello from CallSpy!");
    System.out.println("Usage: ");
    System.out.println("   java -javaagent:/path/to/callspy.jar your.main.Clazz");
    System.out.println("\nEnjoy! :-)");
  }
}
//java -DXbootclasspath/p:javassist.jar:callspy-0.1.jar -javaagent:callspy-0.1.jar com.zeroturnaround.callspy.Main