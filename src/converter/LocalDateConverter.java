package com.idfc.converter;

import javax.persistence.AttributeConverter;
import java.sql.Date;
import java.time.LocalDate;

public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

  @Override
  public Date convertToDatabaseColumn(LocalDate attribute) {
    Date date = null;
    if (attribute != null)
      date = Date.valueOf(attribute);
    return date;
  }

  @Override
  public LocalDate convertToEntityAttribute(Date dbData) {
    LocalDate date = null;
    if (dbData != null) {
      date = dbData.toLocalDate();

    }
    return date;
  }

}
