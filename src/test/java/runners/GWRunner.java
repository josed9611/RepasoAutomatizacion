package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//corra la prueba
@CucumberOptions(
        features = "src/test/resources/features/GW.feature",//ruta donde esta creado el escenario
        glue = "stepDefinitions",// desde donde se va a tomar los metodos
        snippets = SnippetType.CAMELCASE// creee los metodos
)
public class GWRunner {
}