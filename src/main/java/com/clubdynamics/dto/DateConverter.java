package com.clubdynamics.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Responsible for converting dates from and to string representation for serialization / deserialization.
 * 
 * @author Henning Schütz
 *
 */
public class DateConverter {

  public static final String DATE_PATTERN_DAY = "yyyy-MM-dd";
  
  private static final DateTimeFormatter DAY_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN_DAY);
  
  public static LocalDate fromDayString(String dayString) throws DateTimeParseException {
    return LocalDate.parse(dayString, DAY_FORMATTER);
  }
  
  public static String toDayString(LocalDate day) {
    return day.format(DAY_FORMATTER);
  }
}
