package com.thoughtworks.capability.gtb;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate LaborsDay =
            LocalDate.of(LocalDate.now().getYear(), 5, 1);

    if(date.isBefore(LaborsDay)) {
      return ChronoUnit.DAYS.between(date, LocalDate.of(LocalDate.now().getYear(), 5, 1));
    } else {
      return ChronoUnit.DAYS.between(date, LocalDate.of(LocalDate.now().getYear()+1, 5, 1));
    }
  }
}
