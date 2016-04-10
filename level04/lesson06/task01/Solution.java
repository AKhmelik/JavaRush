package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream in = System.in;
        InputStreamReader streemReader = new InputStreamReader(in);
        BufferedReader buffer = new BufferedReader(streemReader);
        String str = buffer.readLine();
        String str2 = buffer.readLine();
        int int1 = Integer.parseInt(str);
        int int2 = Integer.parseInt(str2);
        if(int1>int2){
            System.out.print(int2);
        }
        else {
            System.out.print(int1);
        }

    }
    }
