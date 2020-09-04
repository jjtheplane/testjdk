package ar.com.bancogalicia.model.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import ar.com.bancogalicia.model.PersonType;

@Converter(autoApply = true)
public class PersonTypeConverter implements AttributeConverter<PersonType, String> {

	@Override
	public String convertToDatabaseColumn(PersonType attribute) {
		return attribute.getType();
	}

	@Override
	public PersonType convertToEntityAttribute(String dbData) {
		return PersonType.fromDataBase(dbData);
	}

}
