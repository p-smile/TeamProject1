package application;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;
	
	public Phone(String smartPhone,String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);

}

public String getSmartPhone() {
	return smartPhone.get();
}

public void setSmartPhone(String smartphone) {
	this.smartPhone.set(smartphone);
}

public String getImage() {
	return image.get();
}

public void setImage(String image) {
	this.image.set(image);
	}
}
