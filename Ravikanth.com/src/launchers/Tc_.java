package launchers;

public class Tc_ extends BasseTest{
	public static void main(String[] args) throws Exception
	{
		init();
		Openbrowser("chromedriver");
		URL("AmazonURL");
	}

}
