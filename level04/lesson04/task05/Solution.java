package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream data = System.in;
        Reader inputStreamReader = new InputStreamReader(data);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        int res = Integer.parseInt(name);
        if(res>0){
            System.out.print(res*2);
        }
        else{
            System.out.print(res+1);
        }
    }

}