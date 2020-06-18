package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    int dayOfWeek = date.getDayOfWeek().getValue();
    if(dayOfWeek < 5 || dayOfWeek == 7) {
      return date.plusDays(1);
    }
    if(dayOfWeek == 5) {
      return date.plusDays(3);
    }
    if(dayOfWeek == 6) {
      return date.plusDays(2);
    }
    return date;
  }
}
