package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/Web/TC_001_new.feature",
        "src/test/resources/Feature/Web/TC_002_openAccount.feature",
        "src/test/resources/Feature/Web/TC_003_Delete.feature"},
        glue = {"stepDefs/WebSD"},   monochrome = true,
        dryRun = false,
        tags = "@Smoke1",
        plugin = {"pretty","html:build/reports/ADAW.html"}
)
@Test
class WebRunner extends AbstractTestNGCucumberTests{
}