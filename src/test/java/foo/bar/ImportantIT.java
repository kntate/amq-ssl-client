package foo.bar;

import org.apache.camel.CamelContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CamelSpringBootRunner.class)
@SpringBootTest
public class ImportantIT  {
    @Test
    public void theTest(){
        System.out.println("here");
    }
}
