package co.com.s4n.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/account.feature",
        glue = {"co.com.s4n.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class runner {

}
