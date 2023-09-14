package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/API/getAPI.feature",
        "src/test/resources/Feature/API/postAPI.feature"},
        glue = {"stepDefs/APISD"},   monochrome = true,
        dryRun = false,
        tags = "@Api",
        plugin = {"pretty","html:build/reports/ADAW.html"}
)
@Test
class ApiRunner extends AbstractTestNGCucumberTests{
}