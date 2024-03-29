package sg.com.smartinventory;

import static sg.com.smartinventory.utility.Utility.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmartInventoryApplicationTests {
	/// Name this according to your class name.
	// The Logback library defines 5 log levels in order of priority: TRACE, DEBUG,
	// INFO, WARN, ERROR, with each of these having a corresponding logging method:
	// trace(), debug(), info(), warn(), error().
	private static final Logger test_logger = LoggerFactory.getLogger(SmartInventoryApplicationTests.class);

	// Test Setup and Teardown configuration.
	@BeforeAll
	static void initAll() {

	}

	@AfterAll
	static void teardownAll() {

	}

	@BeforeEach
	void init() {

	}

	@AfterEach
	void teardown() {

	}

	@Test
	void contextLoads() {
		test_logger.info("Starting test: " + getCurrentMethodName() + ". ");

		test_logger.info("Ending test: " + getCurrentMethodName() + ". ");
	}
}