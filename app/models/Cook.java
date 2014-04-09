package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;

@Entity
public class Cook extends Model implements BasicModel<Long> {
	@Id
	private Long id;
	
	@Required
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Long getKey() {
		return id;
	}

	@Override
	public void setKey(Long key) {
		this.id = key;
	}
}
