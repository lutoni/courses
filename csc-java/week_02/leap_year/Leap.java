// В Григорианском календаре год является високосным в двух случаях: 
// либо он кратен 4, но при этом не кратен 100, либо кратен 400.

// Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры 
// (первого года) до заданного года включительно. 

// Ввод-вывод обеспечивает проверяющая система. Вам надо только 
// проанализировать переданное в метод значение и вернуть результат. 
// В программу всегда подается положительный номер года. Предполагается 
// решение без циклов. Вам надо придумать и записать несложную формулу, 
// использующую только арифметические операторы.

public class Leap {
    public static int leapYearCount(int year) {
        return (year - (year % 4)) / 4 - ((year - (year % 100)) / 100 - (year - (year % 400)) / 400);
    }
}


// 2015 % 4 = 3 
// (2015 - (2015 % 4)) / 4 = 503 // сколько раз прошло по 4 года
// (2015 - (2015 % 100)) / 100 = 20 // сколько раз прошло по 100 лет
// (2015 - (2015 % 100)) / 400 = 5 // сколько раз прошло по 400 лет
// (2015 - (2015 % 4)) / 4 - ((2015 - (2015 % 100)) / 100 - (2015 - (2015 % 100)) / 400)