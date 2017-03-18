package pages;

import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleh on 18.02.2017.
 */
public class Resources {

	private SelenideElement cropWareHouseLocator = $("#stockBarGranary");
	private SelenideElement barWareHouseLocator = $("#stockBarWarehouse");
	private SelenideElement woodLocator = $("#l1");
	private SelenideElement clayLocator = $("#l2");
	private SelenideElement ironLocator = $("#l3");
	private SelenideElement cropLocator = $("#l4");

	HashMap<String, Integer> resources;


	public HashMap getAvailableResource() {
		resources.put("wood", Integer.parseInt(woodLocator.getText()));
		resources.put("clay", Integer.parseInt(clayLocator.getText()));
		resources.put("iron", Integer.parseInt(ironLocator.getText()));
		resources.put("crop", Integer.parseInt(cropLocator.getText()));
		return resources;
	}

	public Integer getWarehouseCapacity(String warehouseCapacity) {
		return Integer.parseInt(cropWareHouseLocator.getText());
	}

	public int getAvailableResource(String resource) {
		return resources.get(resource)
	}
}
