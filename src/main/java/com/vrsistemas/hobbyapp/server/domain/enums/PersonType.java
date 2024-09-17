package com.vrsistemas.hobbyapp.server.domain.enums;

public enum PersonType {

	NATURAL_PERSON("N"),
	LEGAL_PERSON("L");
	
	private String type;
	
	private PersonType(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
public static PersonType toEnum(String type) {
		
		if (type == null) {
			return null;
		}
		
		for (PersonType x : PersonType.values()) {
			if (type.equals(x.type)) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Tipo inválido: " + type);
	}
	
}
