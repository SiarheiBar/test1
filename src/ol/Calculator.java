package ol;

import jdk.nashorn.internal.ir.ReturnNode;
import java.util.*;
import  java.io.*;


public class Calculator {


    public static void main(String[] args) {

        int res;
        char op;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пример  ");


        if (in.hasNextInt()){}


        else{
         System.out.println("Нужно ввести число А, оно должно быть целым");
           System.exit(1);}

        int num1 = in.nextInt();


        op = in.next().charAt(0);
        if (in.hasNextInt()){}
        else{
            System.out.println("Нужно ввести число Б, оно должно быть целым");
            System.exit(1);}
        int num2 = in.nextInt();



            if (num1 > 10) {
                System.out.println("Ошибка ввода, число А  не должно быть больше 10");
                System.exit(1);
            }
            if (num1 < 0) {
                System.out.println("Ошибка ввода, число А  не должно быть мешьне 0");
                System.exit(1);
            }

            if (num2 > 10) {
                System.out.println("Ошибка ввода, число Б  не должно быть больше 10");
                System.exit(1);
            }

            if (num2 < 0) {
                System.out.println("Ошибка ввода, число Б  не должно быть мешьне 0");
                System.exit(1);
            }


            switch (op) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                default:
                    System.out.printf("Нет оператора");
                    return;
            }

            System.out.printf( " " + res);
        }
    }

