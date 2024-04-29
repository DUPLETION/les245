package Lesson24._02localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        //в Java 8 появился пакет time
        //LocalDate - для работы с датой
        //LoclaTime - для пабриы со временем
        //LocalDateTime - для ра боты с датой и временем

        LocalDateTime date1 = LocalDateTime.now();//тек дата
        System.out.println(date1);
        //получение интовых значений
        System.out.println(date1.getYear() + " " +  date1.getMonthValue() + " " + date1.getDayOfMonth());
        //текстовое значение месяца из станд перечисления month(enum)
        System.out.println(date1.getMonth());
        System.out.println(date1.getDayOfWeek());//текстовое значения дня недели
        System.out.println(date1.get(ChronoField.DAY_OF_YEAR));//универсальный метод гед принимает значение ChronoField
        //и возвращает число выбранного параметра

        LocalDateTime date2 = LocalDateTime.of(2025,1,25,17,45,21);
        System.out.println(date2);

        //DateTimeFormater - аналог SimpleDateFormat
        //для создания исп не конструктор а статич метод ofpattern
        //синтаксис аналогичен Simple
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-YYYY  HH:mm:ss");
        System.out.println(formatter1.format(date2));
        //любые изменения с date и calendar приводили к изменению самого объекта на котором вызываются методы
        //LocalDate
        //LoclaTime  - Immutable - объекты не изменяемые, методы minus. plus  приводят к созданию нового объектас уетом изменений
        //LocalDateTime

        date2 = date2.minusMonths(2);
        System.out.println(formatter1.format(date2));
        date2 = date2.plusWeeks(10);
        System.out.println(formatter1.format(date2));

        String strDate = "06/24/2024 09:45:02 AM";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        LocalDateTime date3 = LocalDateTime.parse(strDate, formatter2);
        System.out.println(formatter2.format(date3));

        //date3.withDayOfMonth(20) - аналог сета

    }
}
