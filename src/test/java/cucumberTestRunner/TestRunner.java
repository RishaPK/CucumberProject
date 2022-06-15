package cucumberTestRunner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//provide the path of both Feature file and Step definition file
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions"
)
public class TestRunner {
 
}



