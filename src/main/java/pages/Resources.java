package pages;

import com.codeborne.selenide.SelenideElement;
import pages.enums.RESOURCETYPE;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleh on 18.02.2017.
 */
public class Resources {

    HashMap<RESOURCETYPE, Integer> resources;
    private SelenideElement granary = $("#stockBarGranary");
    private SelenideElement warehouse = $("#stockBarWarehouse");
    private SelenideElement woodLocator = $("#l1");
    private SelenideElement clayLocator = $("#l2");
    private SelenideElement ironLocator = $("#l3");
    private SelenideElement cropLocator = $("#l4");

	public HashMap getAvailableResource() {
		resources.put(RESOURCETYPE.WOOD, Integer.parseInt(woodLocator.getText()));
		resources.put(RESOURCETYPE.CLAY, Integer.parseInt(clayLocator.getText()));
		resources.put(RESOURCETYPE.IRON, Integer.parseInt(ironLocator.getText()));
		resources.put(RESOURCETYPE.CROP, Integer.parseInt(cropLocator.getText()));
		return resources;
	}

	public Integer getWarehouseCapacity() {
        return Integer.parseInt(granary.getText());
    }

    public Integer getWarehouse() {
        return Integer.parseInt(warehouse.getText());
    }

	public int getAvailableResource(RESOURCETYPE resource) {
		return resources.get(resource);
	}
}
