package co.in.date;

import java.time.LocalDate;
import java.time.Period;

public class Age {

    public static void main(String[] args) {

        String dob = "2005-01-28";

        LocalDate dateOfBirth = LocalDate.parse(dob);
        LocalDate today = LocalDate.now();

        int age = Period.between(dateOfBirth, today).getYears();

        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Today: " + today);
        System.out.println("Age: " + age);
    }
}
