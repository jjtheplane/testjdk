package ar.com.bancogalicia.model;

public enum PersonType {

	F("F"), J("J");

	private String type;

	private PersonType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public static PersonType fromDataBase(String type) {
		switch (type) {
		case "F":
			return F;
		case "J":
			return J;
		default:
			throw new IllegalArgumentException("Type [" + type + "] not supported.");
		}
	}

	public static PersonType getPersonTypeByIdHost(String idHost) {
		if (idHost.length() == 10 && idHost.startsWith("9")) {
			return J;
		} else if (idHost.length() < 10 || idHost.startsWith("0")) {
			return F;
		} else {
			throw new IllegalArgumentException("Type for idHost [" + idHost + "] not supported.");
		}
	}
}
