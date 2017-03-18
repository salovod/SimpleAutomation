package pages.buy;

import com.codeborne.selenide.SelenideElement;
import pages.Resources;
import pages.enums.RESOURCETYPE;
import pages.enums.SOLDERTYPE;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sacred on 18.03.2017.
 */
public class Soldiers extends Resources {
	private SelenideElement cropWareHouseLocator = $("#stockBarGranary");
	private SelenideElement barWareHouseLocator = $("#stockBarWarehouse");
	private SelenideElement woodLocator = $(".resources.r1");
	private SelenideElement clayLocator = $(".resources.r2");
	private SelenideElement ironLocator = $(".resources.r3");
	private SelenideElement cropLocator = $(".resources.r4");

	HashMap<RESOURCETYPE,Integer> neededResources;

	private void getNeededResources(SOLDERTYPE soldertype) {
		neededResources.put(RESOURCETYPE.CROP,2);
		neededResources.put(RESOURCETYPE.WOOD,2);
		neededResources.put(RESOURCETYPE.IRON,2);
		neededResources.put(RESOURCETYPE.CLAY,2);
	}

	private boolean possibility(SOLDERTYPE soldertype) { //TODO create check available resources and needed for current solder type
		return false;
	}

	public void createSolders( SOLDERTYPE soldertype, int count){
		if(possibility(soldertype)){
			$("").val(String.valueOf(count)).pressEnter();
		}

	}
}
