package com.company;

import java.util.Scanner;

public class Main {
    static int num = getInput();
    public static void main(String[] args) {
loop();
    }
    private static int getInput(){
        System.out.println("give a num");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
 private static void loop(){

        String answer;
     answer = "";
     int i;
        for (i = 1; i < num + 1; i++ ){
            answer = answer + i;
            System.out.println(answer);
        }


     while ( i > 0){
         String ansNew = answer.substring(0, answer.length()-1);
         System.out.println(ansNew);
         answer = ansNew;
         i = i -1;
     }


 }
}
