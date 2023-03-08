package fall2022progect;
import org.junit.Test;
import fall2022progect.util.clean0;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="use_cases",
		plugin= { "summary","html:target/cucumber/wikipedia.html"},
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue="fall2022progect"
		)

 public class testcases {
//
//	@Test
//	public void test0(){
//	clean0 ob = new clean0();}
}
