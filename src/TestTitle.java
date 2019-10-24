import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestTitle {

	Logger log = Logger.getLogger(TestTitle.class);

	@Test
	public void test() {
		log.debug("Test Web Title");
	}
}
