public class OddEven {

    //Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
    // и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”
    //2147483647 + 1 →  “Undefined”

    public String OddEvenAlgorithm(long num){

        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (num <= 2147483647L && num >= -2147483647L){
            if (num % 2 == 0){

                return even; //четное
            }else {

                return odd; //нечетное
            }
        }

        return undefined;
    }
}
