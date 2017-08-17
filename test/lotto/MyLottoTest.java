package lotto;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class MyLottoTest {

	@Before
	public void setUp() {
		Machine machine = new Machine();
		Scanner scanner = new Scanner(System.in);
		User user = new User(5000);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
