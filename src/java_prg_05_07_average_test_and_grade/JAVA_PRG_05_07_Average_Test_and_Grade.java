/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_07_average_test_and_grade;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter five test scores. The program
 * should display a letter grade for each score and the average test score.
 * Write the following methods in the program:
 * 
 *      * calcAverage - This method should accept five test scores as arguments
 *      and return the average of the scores.
 *      * Determine grade - This method should accept a test score as an
 *      argument and return a letter grade for the score, based on the following
 *      grading scale:
 * 
 *          Score           Letter Grade
 *          ----------------------------
 *          90-100              A
 *          80-89               B
 *          70-79               C
 *          60-69               D
 *          Below 60            F
 */
public class JAVA_PRG_05_07_Average_Test_and_Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double dblTest1;
        double dblTest2;
        double dblTest3;
        double dblTest4;
        double dblTest5;
        double dblTestAvg;
        
        dblTest1 = getScore();
        dblTest2 = getScore();
        dblTest3 = getScore();
        dblTest4 = getScore();
        dblTest5 = getScore();
        
        dblTestAvg = getAvgScore(dblTest1, dblTest2, dblTest3, dblTest4,
                dblTest5);
        
        System.out.println("Test 1:");
        displayGrade(dblTest1);
        
        System.out.println("Test 2:");
        displayGrade(dblTest2);
        
        System.out.println("Test 3:");
        displayGrade(dblTest3);
        
        System.out.println("Test 4:");
        displayGrade(dblTest4);
        
        System.out.println("Test 5:");
        displayGrade(dblTest5);
        
        System.out.println("Average test value:");
        displayGrade(dblTestAvg);
    }
    
    public static double getScore()
    {
        double dblScore;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        do
        {
            System.out.print("Please enter a test score: ");
            
            dblScore = scrKeyboard.nextDouble();
        } while (dblScore < 0 || dblScore > 100);
        
        return dblScore;
    }
    
    public static double getAvgScore(double dblTest1, double dblTest2,
            double dblTest3, double dblTest4, double dblTest5)
    {
        double dblTestAvg;
        
        final int INT_NUM_TESTS = 5;
        
        dblTestAvg = (dblTest1 + dblTest2 + dblTest3 + dblTest4 + dblTest5) /
                INT_NUM_TESTS;
        
        return dblTestAvg;
    }
    
    public static void displayGrade(double dblTestScore)
    {
        char chrLetterGrade;
        
        if (dblTestScore < 100 && dblTestScore >= 90)
            chrLetterGrade = 'A';
        else if (dblTestScore < 90 && dblTestScore >= 80)
            chrLetterGrade = 'B';
        else if (dblTestScore < 80 && dblTestScore >= 70)
            chrLetterGrade = 'C';
        else if (dblTestScore < 70 && dblTestScore >= 60)
            chrLetterGrade = 'D';
        else if (dblTestScore < 60)
            chrLetterGrade = 'F';
        else
            chrLetterGrade = 'X';
        
        System.out.println("Test score: " + dblTestScore +
                ", grade: " + chrLetterGrade);
    }
}
