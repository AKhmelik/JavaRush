package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник»,
 «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
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
        if(res==1){
            System.out.print("понедельник");
        }
        else if(res==2){
            System.out.print("вторник");
        }
        else if(res==3){
            System.out.print("среда");
        }
        else if(res==4){
            System.out.print("четверг");
        }
        else if(res==5){
            System.out.print("пятница");
        }
        else if(res==6){
            System.out.print("суббота");
    }
        else if(res==7){
            System.out.print("воскресенье");
        }
        if(res>7 || res<=1){
            System.out.print("такого дня недели не существует");
        }
    }

}