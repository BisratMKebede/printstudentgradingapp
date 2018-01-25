package com.bisratmkebede.studentgrading;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class gradingclass{
    private String GradeLetter;


    @RequestMapping
    public String GradingCalc() {

        System.out.println("Please Enter Your Information");
        String StudentNo;
        String StudentName;
        Double testScore;

        Scanner keyboard = new Scanner(System.in);
        StudentNo = keyboard.nextLine();
        keyboard = new Scanner(System.in);
        StudentName = keyboard.nextLine();
        keyboard = new Scanner(System.in);
        testScore = keyboard.nextDouble();
        keyboard.nextLine();



        if (testScore >= 45 && testScore <= 50) {
            GradeLetter = "A";
            System.out.println(StudentNo + "- "  + StudentName + " " + GradeLetter);
        }
        else if (testScore >= 40 && testScore < 45) {
            GradeLetter = "B";
            System.out.println(StudentNo + "- " + StudentName + " " + GradeLetter);
        }
        else if (testScore >= 35 && testScore < 40) {
            GradeLetter = "C";
            System.out.println(StudentNo + "-" + StudentName + " " + GradeLetter);
        }
        else if (testScore >= 30 && testScore < 35) {
            GradeLetter = "D";
            System.out.println(StudentNo + "- " + StudentName + " " + GradeLetter);
        }
        else {
            System.out.print("F");


        }


        return StudentNo + StudentName +  GradeLetter ;

    }


}


























