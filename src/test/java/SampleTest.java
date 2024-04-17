import br.com.matheus.setup.TestRule;
import org.testng.annotations.Test;

public class SampleTest extends TestRule {

    @Test
    public void sampleTest() {
        System.out.println("Just a test!");
    }
}
