package JPMavenGitHubJenkinsTest3pkg;

import org.testng.annotations.Test;

public class JPTest3

{
	
	@Test
	(groups= {"SmokeTest","RegressionTest"})
	
	public void method3()
	{
		System.out.println("Method3 is running");
		System.out.println("----");

	}
}
