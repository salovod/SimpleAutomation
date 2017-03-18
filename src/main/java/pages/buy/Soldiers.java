package pages.buy;

import com.codeborne.selenide.SelenideElement;
import pages.Resources;
import pages.enums.Buildings;
import pages.enums.RESOURCETYPE;
import pages.enums.SOLDERTYPE;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sacred on 18.03.2017.
 */
public class Soldiers extends Resources {
	private SelenideElement cropWareHouseLocator = $("#stockBarGranary");
	private SelenideElement barWareHouseLocator = $("#stockBarWarehouse");
	private SelenideElement wood = $(".trainUnits .r1"); //TODO check '.unit.u1' as a possible to select 'legioner' solder after adding new solder type
	private SelenideElement clay = $(".trainUnits .r2");
	private SelenideElement iron = $(".trainUnits .r3");
	private SelenideElement crop = $(".trainUnits .r4");
	private SelenideElement number = $("[name='t1']");
	private SelenideElement amount = $(".details > a");


	HashMap<RESOURCETYPE,Integer> neededResources = new HashMap<>();

	public void navigateToBarak() {
		open(Buildings.V1_BARRACKS);
	}

	private void getNeededResources(SOLDERTYPE soldertype) {
		neededResources.put(RESOURCETYPE.CROP,Integer.parseInt(crop.getText()));
		neededResources.put(RESOURCETYPE.WOOD,Integer.parseInt(wood.getText()));
		neededResources.put(RESOURCETYPE.IRON,Integer.parseInt(iron.getText()));
		neededResources.put(RESOURCETYPE.CLAY,Integer.parseInt(clay.getText()));

	}

	private boolean possibility(SOLDERTYPE soldertype, int count) { //TODO create check available resources and needed for current solder type-----
		getNeededResources(SOLDERTYPE.LEGIONARE);
		getAvailableResources();
		for (RESOURCETYPE resourcetype : RESOURCETYPE.values()){
			if (neededResources.get(resourcetype)*count > getAvailableResource(resourcetype))
				return false;
		}
		return true;
	}

	private Integer getSolderAmount(SOLDERTYPE soldertype) {
		return Integer.parseInt(amount.getText().replaceAll("[^0-9]",""));
	}

	public void createSolders( SOLDERTYPE soldertype, int count){
		if(possibility(soldertype,count)){
			if (getSolderAmount(soldertype)<count)
				count = getSolderAmount(soldertype);
			System.out.print("Create "+count+" "+soldertype);
//			number.val(String.valueOf(count)).pressEnter(); // temporary disable.
 }
	}
}
