package eg;

import org.apache.cassandra.thrift.InvalidRequestException;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ThrowHectorExceptionTest {

	@Test
	public void throwHectorException() throws Throwable {
		throw new InvalidRequestException("test invalid request exception");
	}

}
