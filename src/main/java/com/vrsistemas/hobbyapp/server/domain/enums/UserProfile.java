package com.vrsistemas.hobbyapp.server.domain.enums;

public enum UserProfile {

	ADMIN(1, "ROLE_ADMIN"),
	CLIENT(2, "ROLE_CLIENT");
	
	private Integer id;
	private String role;
	
	private UserProfile(Integer id, String role) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public String getRole() {
		return role;
	}
	
	public static UserProfile toEnum(Integer id) {
		
		if (id == null) {
			return null;
		}
		
		for (UserProfile x : UserProfile.values()) {
			if (id.equals(x.getId())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
