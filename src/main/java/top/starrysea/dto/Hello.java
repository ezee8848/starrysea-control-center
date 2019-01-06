package top.starrysea.dto;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Hello {

	@Id
	private Long id;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}