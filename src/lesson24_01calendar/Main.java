package lesson24_01calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        //Класс календарь позволяет не только хранить дату,
        // но и передвигаться относительно хранящейся даты
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        //calendar.get() - универсальные метод.по соотв константе выведет значение
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(calendar.MONTH)+1);//+1 т.к. исчисление месяцев с 1 до 11
        System.out.println(calendar.get(calendar.DATE));

        calendar.set(Calendar.YEAR, 2025);
        System.out.println(calendar.get(calendar.YEAR));

        calendar.add(Calendar.DATE, 15);//дата увеличится на 15 дней
        calendar.add(Calendar.HOUR, -15);
        calendar.add(Calendar.YEAR, -100);
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.MONTH));
        System.out.println(calendar.get(calendar.DATE));


        Calendar calendar1 = new GregorianCalendar();

        System.out.println(calendar.after(calendar1));//дата календаря 2 позже чем календаря 1
        //аналогичный но противоположный метод before

        //getTime - из объекта календарь делает объект date

        Date date2 = calendar1.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM/dd/YYYY - hh:mm a");
        System.out.println(simpleDateFormat.format(date2));

        //setTimeDate - сделает из даты календарь

        //хранит от 0 до 11
        Calendar calendar2 = new GregorianCalendar(2024,4,25,20,26,12);
        System.out.println(simpleDateFormat.format(calendar2.getTime()));
    }
}
