import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Test
{
	@org.junit.Test
	public void todo()
	{
		System.out.println("hi");
	}
}
