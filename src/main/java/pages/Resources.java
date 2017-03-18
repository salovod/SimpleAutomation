package pages;

import com.codeborne.selenide.SelenideElement;
import pages.enums.RESOURCETYPE;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleh on 18.02.2017.
 */
public class Resources {

    HashMap<RESOURCETYPE, Integer> resources = new HashMap<>();
    private SelenideElement granary = $("#stockBarGranary");
    private SelenideElement warehouse = $("#stockBarWarehouse");
    private SelenideElement wood = $("#l1");
    private SelenideElement clay = $("#l2");
    private SelenideElement iron = $("#l3");
    private SelenideElement crop = $("#l4");

	public HashMap getAvailableResources() {
		resources.put(RESOURCETYPE.WOOD, Integer.parseInt(wood.getText().replaceAll("[^0-9]","")));
		resources.put(RESOURCETYPE.CLAY, Integer.parseInt(clay.getText().replaceAll("[^0-9]","")));
		resources.put(RESOURCETYPE.IRON, Integer.parseInt(iron.getText().replaceAll("[^0-9]","")));
		resources.put(RESOURCETYPE.CROP, Integer.parseInt(crop.getText().replaceAll("[^0-9]","")));
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
