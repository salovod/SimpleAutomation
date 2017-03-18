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

	private int availableWood;
	private int availableIron;
	private int availableClay;
	private int availableCrop;
	private int stockCapacity;
	private int cropCapacity;

	HashMap<String, Integer> resources;


	public HashMap getAvailableResource() {

		availableWood = Integer.parseInt(woodLocator.getText());
		availableClay = Integer.parseInt(clayLocator.getText());
		availableIron = Integer.parseInt(ironLocator.getText());
		availableCrop = Integer.parseInt(cropLocator.getText());
		resources.put("wood",availableWood);
		resources.put("clay",availableClay);
		resources.put("iron",availableIron);
		resources.put("crop",getAvailableCrop());
		return resources;
	}

	public int getWarehouseCapacity(String warehouseCapacity) {
		String temp;
		switch (warehouseCapacity) {
			case "crop":
				temp = cropWareHouseLocator.getText();
				cropCapacity = Integer.parseInt(temp);
				return cropCapacity;
			case "resource":
				temp = barWareHouseLocator.getText();
				stockCapacity = Integer.parseInt(temp);
				return stockCapacity;
			default:
				return 0;
		}
	}

	public int getAvailableClay() {
		return availableClay;
	}

	public int getAvailableIron() {
		return availableIron;
	}

	public int getAvailableWood() {
		return availableWood;
	}

	public int getAvailableCrop() {
		return availableCrop;
	}

	public int getStockCapacity() {
		return stockCapacity;
	}

	public int getCropCapacity() {
		return cropCapacity;
	}
}
