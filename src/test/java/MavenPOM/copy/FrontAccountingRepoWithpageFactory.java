package MavenPOM.copy;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountingRepoWithpageFactory {

	
		
		public FrontAccountingRepoWithpageFactory (WebDriver w)
		{
			PageFactory.initElements(w, this);
		}
		
		
		
	

}
