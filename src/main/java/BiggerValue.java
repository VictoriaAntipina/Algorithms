public class BiggerValue {

    //Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.

    //Test Data:
    //3333, 9999
    //Expected Result = 9999

    public int BiggerValueAlgorithm(int num1, int num2){

        if (num1 != num2){
            if (num1 > num2){

                return num1;
            }else {

                return num2;
            }
        }

        return num1;
    }
}
