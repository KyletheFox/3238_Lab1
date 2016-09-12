package Lab1;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class dateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses();
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
	}

}
