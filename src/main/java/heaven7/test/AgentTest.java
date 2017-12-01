package heaven7.test;

public class AgentTest {

    public static void main(String[] args) {
        System.out.println("this is the entry of  heaven7.test.AgentTest");
    }
}

//java -DXbootclasspath/p:javassist.jar:callspy-0.1.jar -javaagent:callspy-0.1.jar heaven7.test.AgentTest