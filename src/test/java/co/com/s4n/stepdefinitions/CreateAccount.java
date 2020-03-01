package co.com.s4n.stepdefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import co.com.s4n.model.exceptions.ResultNotWaitedException;
import  co.com.s4n.model.AccuntModel;
import co.com.s4n.task.Alert;
import co.com.s4n.task.CreateAccounts;
import static co.com.s4n.model.exceptions.ResultNotWaitedException.COULD_NOT_CREATE;
import static co.com.s4n.stepdefinitions.Hook.USER;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;


public class CreateAccount {

	  
@When("^when I am in the form I enter the data$")
public void whenIAmInTheFormIEnterTheData(List<AccuntModel> data)  {
	USER.attemptsTo(CreateAccounts.In(data.get(0)));
}

@Then("^then I will validate that i am registered$")
public void thenIWillValidateThatIAmRegistered()  {
	 USER.should(seeThat(Alert.is(), equalTo(true))
	 .orComplainWith(ResultNotWaitedException.class,COULD_NOT_CREATE));
	        
}
	
}

