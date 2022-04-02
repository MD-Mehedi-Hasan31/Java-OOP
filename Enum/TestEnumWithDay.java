package com.pondit.Enum;

public class TestEnumWithDay {

    public  enum Day{
        SATURDAY,
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        No_Day
    }

    Day day;
    public TestEnumWithDay(Day day){
       this.day=day;
    }

    public String checkTheWeekendDay(){

        switch (day){

            case FRIDAY,SATURDAY -> {
                String s = "This is the Weekend in the week";
                return s;
            }
            case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> {
                String notWeeken= "This is not weekend ";
            return notWeeken;
            }
            }
            return "Not Found Message";
    }


    public static void main(String  []args){

        TestEnumWithDay  friday= new TestEnumWithDay(Day.FRIDAY);
       String friDayOutput= friday.checkTheWeekendDay();
        System.out.println(friDayOutput);
        TestEnumWithDay sunDay= new TestEnumWithDay(Day.SUNDAY);

        String sunDayOutput= sunDay.checkTheWeekendDay();

        System.out.println(sunDayOutput);

        TestEnumWithDay nodays= new TestEnumWithDay(Day.No_Day);

        String noDaysValue= nodays.checkTheWeekendDay();

        System.out.println(noDaysValue);
    }
}
