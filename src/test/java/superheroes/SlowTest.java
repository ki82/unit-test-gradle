package superheroes;
import org.junit.Test;

public class SlowTest {

	@Test public void test1() throws InterruptedException {
		Thread.sleep(3000);
	}

	@Test public void test2() throws InterruptedException {
		Thread.sleep(4000);
	}

	@Test public void test3() throws InterruptedException {
		Thread.sleep(4000);
	}

	@Test public void test4() throws InterruptedException {
		Thread.sleep(4000);
	}

	@Test public void test5() throws InterruptedException {
		Thread.sleep(4000);
	}
}