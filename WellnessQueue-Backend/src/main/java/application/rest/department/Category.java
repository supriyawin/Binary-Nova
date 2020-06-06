package application.rest.department;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;



@Data
@Document
public class Category {
	private String name;
	@Id
	@JsonIgnore
	private String id;
	private String desc;
}
