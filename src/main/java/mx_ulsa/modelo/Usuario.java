package mx_ulsa.modelo;

public class Usuario {
	
	private String username;
	private String password;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Usuario(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public Usuario() {
	}
	
	public boolean isValido() {
		return "admin".equals(username)&& "1234".equals(password);
	}
	
	public boolean isValidoEmail() {
		return "admin@gmail.com".equals(email)&& "1234".equals(password);
	}

}
